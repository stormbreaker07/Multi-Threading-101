package NoNonesence.waitAndNotify.producerConsumer;

public class MutableSyncedInteger {

    private int value;
    private static final int MAX_COUNT = 5;
    private static final int MIN_COUNT = 0;
    private final Object lock = new Object();

        public MutableSyncedInteger(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
        public void increment() throws InterruptedException {
            synchronized (lock) {

                while (true) {
                    System.out.println(value);

                    if (value == MAX_COUNT) {
                        System.out.println("Waiting for removing the item...");
                        lock.wait();
                    } else {
                        value++;
                        lock.notify();
                    }

                    Thread.sleep(300);
                }
            }
        }

        public void decrement() throws InterruptedException {
            synchronized (lock) {
                while(true) {
                    System.out.println(value);
                    if(value == MIN_COUNT) {
                        System.out.println("Waiting for adding new elements...");
                        lock.wait();
                    } else {
                        value--;

                        lock.notify();
                    }

                    Thread.sleep(300);

                }
            }
        }
}
