package NoNonesence.forkAndJoin.printList;

import java.util.List;
import java.util.concurrent.RecursiveAction;

public class RecursivePrintList extends RecursiveAction {

    private final List<Integer> list;

    public RecursivePrintList(List<Integer> list) {
        this.list = list;
    }

    @Override
    protected void compute() {
        if(list.size() > 1) {
            int mid = list.size()/2;
            RecursivePrintList action1 = new RecursivePrintList(list.subList(0, mid));
            RecursivePrintList action2 = new RecursivePrintList(list.subList(mid, list.size()));
            action1.fork();
            action2.fork();

            action1.join();
            action2.join();
        } else {
            System.out.println(Thread.currentThread().getName() + " is printing the value : " + list.getFirst());
        }
    }
}
