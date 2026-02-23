package org.igorborba.java25.stablepreviousfeatures;

import java.util.concurrent.StructuredTaskScope;

// todo: make it easy structured paralelism. If one thread fails, everything fails

public class StructuredConcurrency {

    public record Budget(String supplier, int price) {}

    public static void main(String[] args) {
        // Uso correto da nova API do Java 25: open() + Joiner
        try (var scope = StructuredTaskScope.open(StructuredTaskScope.Joiner.<Budget>allSuccessfulOrThrow())) {

            // 1. Start the subtasks (forks) using type inference (var).
            var taskA = scope.fork(() -> findOnSupplierA());
            var taskB = scope.fork(() -> findOnSupplierB());

            // 2. We wait until all tasks finish.
            // The join() function itself will throw an exception if ANY task fails.
            scope.join();

            // 3. Results
            System.out.println("Result A: " + taskA.get().price());
            System.out.println("Result B: " + taskB.get().price());

        } catch (Exception e) {
            System.err.println("Error to process budgets: " + e.getMessage());
        }
    }

    static Budget findOnSupplierA() throws InterruptedException {
        Thread.sleep(100); // Simulating network
        return new Budget("Tech Shop", 1500);
    }

    static Budget findOnSupplierB() throws InterruptedException {
        Thread.sleep(150);
        return new Budget("Digital Hello World", 1450);
    }
}