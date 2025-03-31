package NoNonesence.resourceLocking;

import NoNonesence.resourceLocking.synchronization.operatedObjects.MutableInteger;
import NoNonesence.resourceLocking.synchronization.operatedObjects.MutableSyncInteger;

public class Worker1 extends Thread {

    private MutableInteger count;
    private MutableSyncInteger count1;
    private boolean flag = false;

    public Worker1(MutableInteger count) {
        this.count = count;
    }

    public Worker1(MutableSyncInteger count) {
        this.count1 = count;
        flag = true;
    }

    @Override
    public void run() {
        for(int i=0;i<10000;i++) {
            if(!flag)
                this.count.value++;
            else
                this.count1.increment();
        }
    }
}
