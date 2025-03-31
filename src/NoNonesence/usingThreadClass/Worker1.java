package NoNonesence.usingThreadClass;

public class Worker1 extends Thread{

    @Override
    public void run() {
        for(int i=0;i<5;i++) {
            System.out.println("worker 1 is running..! and the count is " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
