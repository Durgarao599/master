package multiThreadig;

import java.util.concurrent.*;

public class MyCallableTask implements Callable<String> {

    private final String taskName;

    public MyCallableTask(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public String call() throws Exception {
        System.out.println(taskName + " is executing...");
        Thread.sleep(1000); // Simulate some work
        return "Result from " + taskName;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        MyCallableTask task1 = new MyCallableTask("Task A");
        MyCallableTask task2 = new MyCallableTask("Task B");

        Future<String> future1 = executor.submit(task1);
        Future<String> future2 = executor.submit(task2);

        System.out.println(future1.get()); // Get the result from Task A
        System.out.println(future2.get()); // Get the result from Task B

        executor.shutdown();
    }
}