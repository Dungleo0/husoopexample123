package homework3;

public class Matrices {

    public static void main(String[] args) {

        int row = (int) (Math.random() * 10);
        int col = (int) (Math.random() * 10);

        int[][] matrix1 = new int[row][col];
        int[][] matrix2 = new int[row][col];

        createRandomMatrix(matrix1);
        createRandomMatrix(matrix2);

        double[][] matrixReal1 = new double[row][col];
        double[][] matrixReal2 = new double[row][col];

        createRandomMatrix(matrixReal1);
        createRandomMatrix(matrixReal2);

        if (haveSameDimension(matrix1, matrix2) || haveSameDimension(matrixReal1,matrixReal2)) {
            int[][] addMatrix = add(matrix1, matrix2);
            printMatrix(addMatrix);

            System.out.println();

            int[][] subtract = subtract(matrix1, matrix2);
            printMatrix(subtract);

            System.out.println();

            double[][] addMatrixReal = add(matrixReal1, matrixReal2);
            printMatrix(addMatrixReal);

            System.out.println();

            double[][] subtractMatrixReal = subtract(matrixReal1, matrixReal2);
            printMatrix(subtractMatrixReal);

            System.out.println();


        } else if(row == col){
            int[][] multiply = multiply(matrix1, matrix2);
            printMatrix(multiply);

            System.out.println();

            double[][] multiplyMatrixReal = multiply(matrixReal1, matrixReal2);
            printMatrix(multiplyMatrixReal);
        }
    }

    public static void createRandomMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 10);
            }
        }
    }


    public static void createRandomMatrix(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = Math.random() * 10;
            }
        }
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void printMatrix(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static double[][] add(double[][] matrix1, double[][] matrix2) {
        double[][] result = new double[matrix1.length][matrix1[0].length];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = matrix2[i][j] + matrix1[i][j];
            }
        }
        return result;
    }

    public static int[][] add(int[][] matrix1, int[][] matrix2) {
        int[][] result = new int[matrix1.length][matrix1[0].length];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = matrix2[i][j] + matrix1[i][j];
            }
        }
        return result;
    }

    public static int[][] subtract(int[][] matrix1, int[][] matrix2) {
        int[][] subtract = new int[matrix1.length][matrix1[0].length];
        for (int i = 0; i < subtract.length; i++) {
            for (int j = 0; j < subtract[0].length; j++) {
                subtract[i][j] = Math.abs(matrix2[i][j] - matrix1[i][j]);
            }
        }
        return subtract;
    }

    public static double[][] subtract(double[][] matrix1, double[][] matrix2) {
        double[][] subtract = new double[matrix1.length][matrix1[0].length];
        for (int i = 0; i < subtract.length; i++) {
            for (int j = 0; j < subtract[0].length; j++) {
                subtract[i][j] = Math.abs(matrix2[i][j] - matrix1[i][j]);
            }
        }
        return subtract;
    }

    public static int[][] multiply(int[][] matrix1, int[][] matrix2) {
        int[][] multiply = new int[matrix1.length][matrix2[0].length];
        for (int i = 0; i < multiply.length; i++) {
            for (int j = 0; j < multiply[i].length; j++) {
                multiply[i][j] = 0;
                for (int k = 0; k < matrix2.length; k++) {
                    multiply[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return multiply;
    }

    public static double[][] multiply(double[][] matrix1, double[][] matrix2) {
        double[][] multiply = new double[matrix1.length][matrix2[0].length];
        for (int i = 0; i < multiply.length; i++) {
            for (int j = 0; j < multiply[i].length; j++) {
                multiply[i][j] = 0.0;
                for (int k = 0; k < matrix2.length; k++) {
                    multiply[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return multiply;
    }

    public static boolean haveSameDimension(int[][] matrix1, int[][] matrix2) {
        return (matrix1.length == matrix2.length && matrix1[0].length == matrix2[0].length);
    }

    public static boolean haveSameDimension(double[][] matrix1, double[][] matrix2) {
        return (matrix1.length == matrix2.length && matrix1[0].length == matrix2[0].length);
    }
}
