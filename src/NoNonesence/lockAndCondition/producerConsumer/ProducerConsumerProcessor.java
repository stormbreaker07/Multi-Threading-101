package NoNonesence.lockAndCondition.producerConsumer;


public class ProducerConsumerProcessor {

    private final MutableSyncedInteger count;

    public ProducerConsumerProcessor() {
        this.count = new MutableSyncedInteger(0);
    }

    public void runProcess() throws InterruptedException {
        ProducerThread pt = new ProducerThread(count);
        ConsumerThread ct = new ConsumerThread(count);

        pt.start();
        ct.start();

        pt.join();
        ct.join();
    }
}
