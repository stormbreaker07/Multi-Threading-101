package NoNonesence.waitAndNotify.printOddAndEven;

public class EvenNumberThread extends Thread{

    private final MutableSyncedInteger value;

    public EvenNumberThread(MutableSyncedInteger value) {
        this.value = value;
    }

    @Override
    public void run() {
        try {
            value.printEvenNumber();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
