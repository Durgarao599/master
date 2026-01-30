package multiThreadig;

public class EvenOddJava8 {
    private static final Object lock = new Object();
    private static int counter = 1;
    private static final int LIMIT = 10;

    public static void main(String[] args) {
        Runnable printOdd = () -> {
            while (counter <= LIMIT) {
                synchronized (lock) {
                    if (counter % 2 != 0) {
                        System.out.println(Thread.currentThread().getName() +"  Odd: " + counter);
                        counter++;
                        lock.notify();
                    } else {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                        }
                    }
                }
            }
        };

        Runnable printEven = () -> {
            while (counter <= LIMIT) {
                synchronized (lock) {
                    if (counter % 2 == 0) {
                        System.out.println(Thread.currentThread().getName()  +"  Even: " + counter);
                        counter++;
                        lock.notify();
                    } else {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                        }
                    }
                }
            }
        };

        Thread oddThread = new Thread(printOdd);
        Thread evenThread = new Thread(printEven);

        oddThread.start();
        evenThread.start();
    }
}