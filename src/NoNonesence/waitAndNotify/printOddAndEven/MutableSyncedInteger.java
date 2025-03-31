package NoNonesence.waitAndNotify.printOddAndEven;

public class MutableSyncedInteger {

    private int value;
    private final int MAX_VALUE;
    private static final Object lock = new Object();

    public MutableSyncedInteger(int MAX_VALUE) {
        this.MAX_VALUE = MAX_VALUE;
    }

    public void printOddNumber() throws InterruptedException {
        synchronized (lock) {
            while(value <= MAX_VALUE) {
                //value is even
                if (value % 2 == 0) {
                    System.out.println("waiting for other thread to print even number");
                    lock.wait();
                } else {
                    System.out.println(Thread.currentThread().getName() + " is printing " + value);
                    value++;
                    lock.notify();
                }

                Thread.sleep(300);
            }
        }
    }

    public void printEvenNumber() throws InterruptedException {
        synchronized (lock) {
            while(value <= MAX_VALUE) {
                //value is even
                if (value % 2 != 0) {
                    System.out.println("waiting for other thread to print odd number");
                    lock.wait();
                } else {
                    System.out.println(Thread.currentThread().getName() + " is printing " + value);
                    value++;
                    lock.notify();
                }

                Thread.sleep(300);
            }
        }
    }
}
