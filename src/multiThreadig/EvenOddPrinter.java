package multiThreadig;

public class EvenOddPrinter {
    private int counter = 1;
    private final int limit;

    public EvenOddPrinter(int limit) {
        this.limit = limit;
    }

    public synchronized void printOdd() {
        while (counter <= limit) {
            if (counter % 2 == 1) {
                System.out.println("ThreadName: " + Thread.currentThread().getName() + "Odd: " + counter);
                counter++;
                notify(); // Wake up even thread
            } else {
                try {
                    wait(); // Wait for even thread
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    public synchronized void printEven() {
        while (counter <= limit) {
            if (counter % 2 == 0) {
                System.out.println("ThreadName: " + Thread.currentThread().getName() + "Even: " + counter);
                counter++;
                notify(); // Wake up odd thread
            } else {
                try {
                    wait(); // Wait for odd thread
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    public static void main(String[] args) {
        EvenOddPrinter printer = new EvenOddPrinter(10);

        Thread oddThread = new Thread(printer::printOdd);
        Thread evenThread = new Thread(printer::printEven);

        oddThread.start();
        evenThread.start();
    }
}