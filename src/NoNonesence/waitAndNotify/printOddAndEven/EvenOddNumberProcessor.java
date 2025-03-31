package NoNonesence.waitAndNotify.printOddAndEven;

public class EvenOddNumberProcessor {

    private final MutableSyncedInteger value;

    public EvenOddNumberProcessor() {
        this.value = new MutableSyncedInteger(15);
    }

    public void runProcess() throws InterruptedException {
        EvenNumberThread et = new EvenNumberThread(value);
        OddNumberThread ot = new OddNumberThread(value);

        et.start();
        ot.start();

        et.join();
        ot.join();
    }
}
