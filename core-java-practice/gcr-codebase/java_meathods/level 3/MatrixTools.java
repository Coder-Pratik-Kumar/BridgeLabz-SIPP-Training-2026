import java.util.Scanner;

public class MatrixTools {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter matrix size (2 or 3): ");
        int size = scanner.nextInt();

        if (size != 2 && size != 3) {
            System.out.println("Only 2x2 and 3x3 matrices are supported.");
            scanner.close();
            return;
        }

        double[][] matrix = randomMatrix(size, size);
        System.out.println("Matrix:");
        displayMatrix(matrix);

        System.out.println("Transpose:");
        displayMatrix(transpose(matrix));

        if (size == 2) {
            double det = determinant2x2(matrix);
            System.out.printf("Determinant: %.2f%n", det);
            if (det != 0) {
                System.out.println("Inverse:");
                displayMatrix(inverse2x2(matrix));
            } else {
                System.out.println("Matrix is singular; no inverse.");
            }
        } else {
            double det = determinant3x3(matrix);
            System.out.printf("Determinant: %.2f%n", det);
            if (det != 0) {
                System.out.println("Inverse:");
                displayMatrix(inverse3x3(matrix));
            } else {
                System.out.println("Matrix is singular; no inverse.");
            }
        }
        scanner.close();
    }

    public static double[][] randomMatrix(int rows, int cols) {
        double[][] matrix = new double[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = (int) (Math.random() * 10) + 1;
            }
        }
        return matrix;
    }

    public static double[][] transpose(double[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        double[][] transposed = new double[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }
        return transposed;
    }

    public static double determinant2x2(double[][] m) {
        return m[0][0] * m[1][1] - m[0][1] * m[1][0];
    }

    public static double determinant3x3(double[][] m) {
        return m[0][0] * (m[1][1] * m[2][2] - m[1][2] * m[2][1])
                - m[0][1] * (m[1][0] * m[2][2] - m[1][2] * m[2][0])
                + m[0][2] * (m[1][0] * m[2][1] - m[1][1] * m[2][0]);
    }

    public static double[][] inverse2x2(double[][] m) {
        double det = determinant2x2(m);
        return new double[][]{
                {m[1][1] / det, -m[0][1] / det},
                {-m[1][0] / det, m[0][0] / det}
        };
    }

    public static double[][] inverse3x3(double[][] m) {
        double det = determinant3x3(m);
        double[][] adj = new double[3][3];

        adj[0][0] =  m[1][1] * m[2][2] - m[1][2] * m[2][1];
        adj[0][1] = -(m[0][1] * m[2][2] - m[0][2] * m[2][1]);
        adj[0][2] =  m[0][1] * m[1][2] - m[0][2] * m[1][1];
        adj[1][0] = -(m[1][0] * m[2][2] - m[1][2] * m[2][0]);
        adj[1][1] =  m[0][0] * m[2][2] - m[0][2] * m[2][0];
        adj[1][2] = -(m[0][0] * m[1][2] - m[0][2] * m[1][0]);
        adj[2][0] =  m[1][0] * m[2][1] - m[1][1] * m[2][0];
        adj[2][1] = -(m[0][0] * m[2][1] - m[0][1] * m[2][0]);
        adj[2][2] =  m[0][0] * m[1][1] - m[0][1] * m[1][0];

        double[][] inverse = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                inverse[i][j] = adj[i][j] / det;
            }
        }
        return inverse;
    }

    public static void displayMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double value : row) {
                System.out.printf("%8.2f", value);
            }
            System.out.println();
        }
    }
}
