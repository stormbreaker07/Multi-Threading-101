import NoNonesence.daemonThread.RunDaemonThread;
import NoNonesence.resourceLocking.synchronization.WithNoSynchronization;
import NoNonesence.resourceLocking.synchronization.WithSynchronization;
import NoNonesence.waitForThread.WaitForThreadToComplete;

public class Main {
    public static void main(String[] args) throws InterruptedException {

//        UsingRunnable runnable = new UsingRunnable();
//        runnable.runBothWorkers();
//        WaitForThreadToComplete waitForThreadToComplete = new WaitForThreadToComplete();
//        waitForThreadToComplete.executeThreadWithJoin();
//        RunDaemonThread runDaemonThread = new RunDaemonThread();
//        runDaemonThread.letsRunDaemonThread();
//        WithNoSynchronization withNoSynchronization = new WithNoSynchronization();
//        withNoSynchronization.runWorkers();
        WithSynchronization withSynchronization = new WithSynchronization();
        withSynchronization.runWorkerThreads();
    }
}