package NoNonesence.lockAndCondition.producerConsumer;

public class ConsumerThread extends Thread {

    private final MutableSyncedInteger count;

    public ConsumerThread(MutableSyncedInteger count) {
        this.count =  count;
    }

    @Override
    public void run() {
        try {
            count.decrement();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
