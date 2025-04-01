package NoNonesence.forkAndJoin.withInvoke;

import java.util.concurrent.ForkJoinPool;

public class ActionRunner {

    public static void runTasks() {

        ForkJoinPool pool = new ForkJoinPool();
        SimpleRecursiveAction action = new SimpleRecursiveAction(1000);
        action.invoke();
    }
}
