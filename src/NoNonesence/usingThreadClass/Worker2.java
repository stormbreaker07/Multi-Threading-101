package NoNonesence.usingThreadClass;

public class Worker2 extends Thread {
    @Override
    public void run() {
        for(int i=0;i<5;i++) {
            System.out.println("worker 2 is running..! and the count is " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
