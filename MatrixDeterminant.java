public class MatrixDeterminant {
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

