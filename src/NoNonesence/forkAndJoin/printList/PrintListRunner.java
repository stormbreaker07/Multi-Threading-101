package NoNonesence.forkAndJoin.printList;

import java.util.List;
import java.util.concurrent.ForkJoinPool;

public class PrintListRunner {

    public static void printList() {
        List<Integer> lt = List.of(1,2,3,4,5,6,7,8,9,10);
        ForkJoinPool pool = new ForkJoinPool();
        RecursivePrintList action = new RecursivePrintList(lt);
        action.invoke();
    }
}
