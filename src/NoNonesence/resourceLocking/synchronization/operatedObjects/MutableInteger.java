package NoNonesence.resourceLocking.synchronization.operatedObjects;

public class MutableInteger {
    public int value;

    public MutableInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
