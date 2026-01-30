package multiThreadig;

import java.util.concurrent.*;

public class FutureEx {

    public static void main(String[] args) throws ExecutionException, InterruptedException {


        ExecutorService executor = Executors.newFixedThreadPool(2);

        Callable<Integer> task = () -> {
            Thread.sleep(1000);
            return 42;
        };

        Future<Integer> future = executor.submit(task);

// Do other work...

        Integer result = future.get(); // blocks until result is ready
        System.out.println("Result: " + result);
    }

}
