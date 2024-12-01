public class MatrixDeterminant {

  
    public static double determinant(double[][] matrix) {
        int n = matrix.length;

        // Check if the matrix is square
        for (double[] row : matrix) {
            if (row.length != n) {
                throw new IllegalArgumentException("Matrix must be square.");
            }
        }

        // Base case: If matrix is 1x1, return the single element
        if (n == 1) {
            return matrix[0][0];
        }

        // Base case: If matrix is 2x2, calculate directly
        if (n == 2) {
            return (matrix[0][0] * matrix[1][1]) - (matrix[0][1] * matrix[1][0]);
        }

        // Recursive case: Calculate determinant using cofactors
        double determinant = 0;
        for (int col = 0; col < n; col++) {
            determinant += Math.pow(-1, col) * matrix[0][col] * determinant(subMatrix(matrix, 0, col));
        }

        return determinant;
    }

  
    private static double[][] subMatrix(double[][] matrix, int excludeRow, int excludeCol) {
        int n = matrix.length;
        double[][] subMatrix = new double[n - 1][n - 1];

        int rowIndex = 0;
        for (int i = 0; i < n; i++) {
            if (i == excludeRow) {
                continue;
            }
            int colIndex = 0;
            for (int j = 0; j < n; j++) {
                if (j == excludeCol) {
                    continue;
                }
                subMatrix[rowIndex][colIndex] = matrix[i][j];
                colIndex++;
            }
            rowIndex++;
        }
        return subMatrix;
    }

    // Test cases for the determinant method
    public static void main(String[] args) {
        // Test 1: 2x2 Matrix
        double[][] matrix1 = {
            {4, 6},
            {3, 8}
        };
        System.out.println("Determinant of 2x2 matrix: " + determinant(matrix1)); // Output: 14.0

        // Test 2: 3x3 Matrix
        double[][] matrix2 = {
            {6, 1, 1},
            {4, -2, 5},
            {2, 8, 7}
        };
        System.out.println("Determinant of 3x3 matrix: " + determinant(matrix2)); // Output: -306.0

        // Test 3: 1x1 Matrix
        double[][] matrix3 = {
            {10}
        };
        System.out.println("Determinant of 1x1 matrix: " + determinant(matrix3)); // Output: 10.0

        // Test 4: Invalid non-square matrix
        try {
            double[][] matrix4 = {
                {1, 2, 3},
                {4, 5, 6}
            };
            determinant(matrix4);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}


