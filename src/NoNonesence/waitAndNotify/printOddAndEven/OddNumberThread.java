package NoNonesence.waitAndNotify.printOddAndEven;

public class OddNumberThread extends Thread {

    private final MutableSyncedInteger value;

    public OddNumberThread(MutableSyncedInteger value) {
        this.value = value;
    }

    @Override
    public void run() {
        try {
            value.printOddNumber();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
