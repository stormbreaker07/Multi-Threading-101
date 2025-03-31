package NoNonesence.daemonThread;

public class RunDaemonThread {

    public void letsRunDaemonThread() {
        //daemon thread looks same as normal worker thread we just need to set setDaemon to true
        // now daemon thread is a low priority thread and once other workng thread complete there
        // execution this thread also destroyed as its utility is only till other thread working.
        DaemonThread dt = new DaemonThread();

        dt.setDaemon(true);
        NormalWorkerThread nwt = new NormalWorkerThread();

        dt.start();
        nwt.start();
    }
}
