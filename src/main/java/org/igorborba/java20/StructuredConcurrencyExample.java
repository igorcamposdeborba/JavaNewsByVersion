package org.igorborba.java20;

public class StructuredConcurrencyExample {
    public static void main(String[] args) throws InterruptedException {
        int[][] matrixA = {{-1, 3}, {4, 2}};
        int[][] matrixB = {{1, 2}, {3, 4}};

        int linesA = matrixA.length;
        int columnsA = matrixA[0].length;

        int linesB = matrixB.length;
        int columnsB = matrixB[0].length;

        int[][] matrixResult = new int[linesA][columnsB];
        Thread[][] matrixThread = new Thread[linesA][columnsB];

        if(columnsA !=linesB) {
            System.out.println("The matrix dimensions are incompatibles for multiplying");
        }
        for(int i=0; i < linesA; i++) {
            for(int j=0; j < columnsB; j++) {
                // thread: multiplies concomitant lines and columns in the same time
                final int lineI = i;
                final int columnJ = j;
                matrixThread[i][j] = new Thread(() -> {
                    for(int k=0; k < matrixA[0].length; k++) {
                        matrixResult[lineI][columnJ] += matrixA[lineI][k] * matrixB[k][columnJ];
                    }
                });
                matrixThread[i][j].start();
                // procedural way - alternative to thread
//                for(int k=0; k < matrixA[0].length; k++) {
//                    matrixResult[i][j] += matrixA[i][k] * matrixB[k][j];
//                }
            }
        }

        // wait the end of all threads to join it
        for (int i=0; i < linesA; i++){
            for (int j=0; j<columnsB; j++){
                matrixThread[i][j].join();
            }
        }

        for(int i=0; i < linesA; i++) {
            for(int j=0; j < columnsB; j++) {
                System.out.print(matrixResult[i][j] + " ");
            }
            System.out.println();
        }
    }
}
