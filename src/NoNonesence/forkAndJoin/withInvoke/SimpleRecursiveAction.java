package NoNonesence.forkAndJoin.withInvoke;

import java.util.concurrent.RecursiveAction;

public class SimpleRecursiveAction extends RecursiveAction {

    private final int value;

    public SimpleRecursiveAction(int value) {
        this.value = value;
    }

    @Override
    protected void compute() {
            if(value > 100) {
                System.out.println("dividing task in to subtask " + value);
                SimpleRecursiveAction action1 = new SimpleRecursiveAction(value/2);
                SimpleRecursiveAction action2 = new SimpleRecursiveAction(value/2);

                invokeAll(action1, action2);
            } else {
                System.out.println("value is sub divided in to value less then or equal to 100");
            }
    }
}
