package NoNonesence.waitForThread;

import NoNonesence.usingThreadClass.Worker1;
import NoNonesence.usingThreadClass.Worker2;

/**
 * in this class we are going to use join method on thread so that the main thread will execute further only
 * when the other threads will stop working or dead or execute their work.
 * If we dont use that then the main thread will run till end and then exist when other thread complete
 * there task
 */
public class WaitForThreadToComplete {

    public void executeThreadWithJoin() throws InterruptedException {

        Worker1 worker1 = new Worker1();
        Worker2 worker2 = new Worker2();

        worker1.start();
        worker2.start();

        //comment next 2 line of join then run the method you will find that system.out on line 29
        //print first then these threads data printed.
        //happening because when both threads are on sleep the main thread get the resource and run
        // the line 29
        worker1.join();
        worker2.join();

        System.out.println("it will execute later.. after both worker thread finish there work");
    }
}
