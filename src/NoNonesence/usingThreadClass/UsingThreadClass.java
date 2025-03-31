package NoNonesence.usingThreadClass;

public class UsingThreadClass {

    public void runBothWorker() {
        Worker1 w1 = new Worker1();
        Worker2 w2 = new Worker2();

        w1.start();
        w2.start();
    }
}
