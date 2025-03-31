package NoNonesence.daemonThread;

public class NormalWorkerThread extends Thread {

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Normal thread runs now..");
    }
}
