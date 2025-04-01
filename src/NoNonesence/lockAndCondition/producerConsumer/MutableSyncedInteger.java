package NoNonesence.lockAndCondition.producerConsumer;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MutableSyncedInteger {

    private int value;
    private static final int MAX_COUNT = 5;
    private static final int MIN_COUNT = 0;
    private final Lock lock = new ReentrantLock();
    private final Condition condition1 = lock.newCondition();
    private final Condition condition2 = lock.newCondition();
    private boolean isIncrement = true;

    public MutableSyncedInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void increment() throws InterruptedException {
        lock.lock();
        try {
            if(!isIncrement) {
                System.out.println("waiting for other thread to remove elements");
                condition1.await();
            } else {
                while(value < MAX_COUNT) {
                    System.out.println(value);
                    value++;
                    Thread.sleep(300);
                }

                isIncrement = false;
                condition2.signal();
            }
        } finally {
            lock.unlock();
        }
    }

    public void decrement() throws InterruptedException {

        lock.lock();
        try {
            if(isIncrement) {
                System.out.println("waiting for other thread to add elements");
                condition2.await();
            }
            else {
                while(value > MIN_COUNT) {
                    System.out.println(value);
                    value--;
                    Thread.sleep(300);
                }
            }

            isIncrement = true;
            condition1.signal();
        } finally {
            lock.unlock();
        }
    }
}
