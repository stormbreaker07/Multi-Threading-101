package NoNonesence.waitAndNotify.producerConsumer;

import NoNonesence.resourceLocking.synchronization.operatedObjects.MutableInteger;
import NoNonesence.resourceLocking.synchronization.operatedObjects.MutableSyncInteger;

public class ProducerThread extends Thread {

    private final MutableSyncedInteger count;

    public ProducerThread(MutableSyncedInteger count) {
        this.count = count;
    }

    @Override
    public void run() {
        try {
            count.increment();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
