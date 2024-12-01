public class MatrixMultiplication {
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
}