package NoNonesence.runnable;

public class UsingRunnable {

    public void runBothWorkers() {
        Thread t1 = new Thread(new Worker1());
        Thread t2 = new Thread(new Worker2());
        t1.start();
        t2.start();
    }

}
