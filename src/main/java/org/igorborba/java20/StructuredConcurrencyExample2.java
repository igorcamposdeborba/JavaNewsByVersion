package org.igorborba.java20;

import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class StructuredConcurrencyExample2 {
    public static void main(String[] args) throws Exception {

        int[][] matrixA = {{-1, 3}, {4, 2}};
        int[][] matrixB = {{1, 2}, {3, 4}};

        int linesA = matrixA.length;
        int columnsA = matrixA[0].length;
        int columnsB = matrixB[0].length;

        int[][] result = new int[linesA][columnsB];

        try (var executor = Executors.newVirtualThreadPerTaskExecutor()) {

            Future<?>[] tasks = new Future[linesA];

            for (int i = 0; i < linesA; i++) {
                final int row = i;

                // thread: multiplies concomitant lines and columns in the same time
                tasks[i] = executor.submit(() -> {
                    for (int j = 0; j < columnsB; j++) {
                        for (int k = 0; k < columnsA; k++) {
                            result[row][j] += matrixA[row][k] * matrixB[k][j];
                        }
                    }
                });
            }

            for (Future<?> task : tasks) {
                task.get(); // wait the end of all threads to join it
            }
        }

        print(result);
    }

    static void print(int[][] matrix) {
        for (var row : matrix) {
            for (var value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}