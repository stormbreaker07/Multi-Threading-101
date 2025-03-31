package NoNonesence.daemonThread;

public class DaemonThread extends Thread{

    @Override
    public void run() {
        while(true) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Daemon thread running...");
        }
    }
}
