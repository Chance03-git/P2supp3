public class MatrixMultiplication {
    /**
     * Static method to multiply two matrices together.
     *
     * @param matrixA The first matrix as a 2D array.
     * @param matrixB The second matrix as a 2D array.
     * @return The resulting matrix after multiplication.
     * @throws IllegalArgumentException If the number of columns in matrixA
     *                                  does not match the number of rows in matrixB.
     */
    public static double[][] multiply(double[][] matrixA, double[][] matrixB) {
        int rowsA = matrixA.length;
        int colsA = matrixA[0].length;
        int rowsB = matrixB.length;
        int colsB = matrixB[0].length;

        // Check if matrix multiplication is possible
        if (colsA != rowsB) {
            throw new IllegalArgumentException("Matrix dimensions are incompatible for multiplication.");
        }

        // Resultant matrix
        double[][] result = new double[rowsA][colsB];

        // Matrix multiplication logic
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }
        return result;
    }
    // Test cases for matrix multiplication
    public static void main(String[] args) {
        // Test 1: 2x2 Matrices
         double[][] matrixA1 = {
            {1, 2},
            {3, 4}
        };
         double[][] matrixB1 = {
            {5, 6},
            {7, 8}
        };

        double[][] result1 = multiply(matrixA1, matrixB1);
        System.out.println("Result of multiplying two 2x2 matrices:");
        printMatrix(result1);

        // Test 2: 3x2 and 2x3 Matrices
         double[][] matrixA2 = {
            {1, 2},
            {3, 4},
            {5, 6}
        };
        double[][] matrixB2 = {
            {7, 8, 9},
            {10, 11, 12}
        };

        double[][] result2 = multiply(matrixA2, matrixB2);
        System.out.println("Result of multiplying a 3x2 and 2x3 matrix:");
        printMatrix(result2);

        // Test 3: Invalid dimensions
        try {
            double[][] invalidMatrixA = {
                {1, 2},
                {3, 4}
            };
            double[][] invalidMatrixB = {
                {5, 6, 7}
            };

            multiply(invalidMatrixA, invalidMatrixB);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    public static void printMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
