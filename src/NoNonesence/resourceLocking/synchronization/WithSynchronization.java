package NoNonesence.resourceLocking.synchronization;

import NoNonesence.resourceLocking.Worker1;
import NoNonesence.resourceLocking.Worker2;
import NoNonesence.resourceLocking.synchronization.operatedObjects.MutableInteger;
import NoNonesence.resourceLocking.synchronization.operatedObjects.MutableSyncInteger;

/**
 * in this we will try to make count increment a universal method and try to make it synchronized
 */
public class WithSynchronization {

    //it makes increment a universal method for this object.
    //MutableSyncInteger is a Thread-safe data structure.
    private final MutableSyncInteger count;

    public WithSynchronization() {
        this.count = new MutableSyncInteger(0);
    }

    public void runWorkerThreads() {
        Worker1 worker1 = new Worker1(count);
        Worker2 worker2 = new Worker2(count);

        worker2.start();
        worker1.start();

        try {
            worker1.join();
            worker2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(this.count.getValue());
    }
}
