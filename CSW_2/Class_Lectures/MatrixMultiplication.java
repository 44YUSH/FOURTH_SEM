package Class_Lectures;

public class MatrixMultiplication {
    public static void main(String[] args) {
        int[][] matrixA = {{1, 2}, {3, 4}, {5, 6}};
        int[][] matrixB = {{1, 2, 3, 4}, {5, 6, 7, 8}};

        int[][] resultMatrix = new int[3][4];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 2; k++) {
                    resultMatrix[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }

        System.out.println("Result Matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

/*
OUTPUT : 

Result Matrix:
11 14 17 20 
23 30 37 44 
35 46 57 68
*/