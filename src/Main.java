import NoNonesence.daemonThread.RunDaemonThread;
import NoNonesence.forkAndJoin.printList.PrintListRunner;
import NoNonesence.forkAndJoin.withInvoke.ActionRunner;
import NoNonesence.lockAndCondition.producerConsumer.ProducerConsumerProcessor;
import NoNonesence.resourceLocking.synchronization.WithNoSynchronization;
import NoNonesence.resourceLocking.synchronization.WithSynchronization;
import NoNonesence.waitAndNotify.printOddAndEven.EvenOddNumberProcessor;
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
//        WithSynchronization withSynchronization = new WithSynchronization();
//        withSynchronization.runWorkerThreads();
//        ProducerConsumerProcessor pcp = new ProducerConsumerProcessor();
//        pcp.runProcess();
//        EvenOddNumberProcessor evenOddNumberProcessor = new EvenOddNumberProcessor();
//        evenOddNumberProcessor.runProcess();
//        ProducerConsumerProcessor producerConsumerProcessor = new ProducerConsumerProcessor();
//        producerConsumerProcessor.runProcess();
//        ActionRunner.runTasks();
        PrintListRunner.printList();
    }


}