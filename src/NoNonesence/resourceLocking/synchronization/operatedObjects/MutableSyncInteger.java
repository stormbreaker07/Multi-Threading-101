package NoNonesence.resourceLocking.synchronization.operatedObjects;

public class MutableSyncInteger {
    private int value;

    public MutableSyncInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public synchronized void increment() {
        this.value++;
    }
}
