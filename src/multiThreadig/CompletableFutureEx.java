package multiThreadig;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureEx {
    public static void main(String[] args) {
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            // Simulate a long-running task
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            return "Result from the future";
        });

        future.thenAccept(result -> System.out.println("Received: " + result)); // Chaining

        try {
           // String actualResult = future.get(); // Blocking call
            System.out.println("Got: " + future.get());
        } catch (Exception e) {
            // Handle exceptions
        }
    }
}
