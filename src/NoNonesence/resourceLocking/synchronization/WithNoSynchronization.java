package NoNonesence.resourceLocking.synchronization;

import NoNonesence.resourceLocking.synchronization.operatedObjects.MutableInteger;
import NoNonesence.resourceLocking.Worker1;
import NoNonesence.resourceLocking.Worker2;


/**
 * in this class we didn't synchronized the MutableInteger that why when its updating in
 * both the thread then the output is different in most of the cases sometime it,
 * 14052, 19988, 20000
 */
public class WithNoSynchronization {

    private final MutableInteger count;


    public WithNoSynchronization() {
        count = new MutableInteger(0);
    }

    public void runWorkers() {
        Worker1 w1 = new Worker1(count);
        Worker2 w2 = new Worker2(count);

        w1.start();
        w2.start();

        try {
            w1.join();
            w2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(count.getValue());
    }
}
