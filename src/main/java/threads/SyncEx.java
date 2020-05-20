package threads;

import java.util.concurrent.atomic.AtomicInteger;

public class SyncEx {

    volatile int  count = 0;
    AtomicInteger atomicInteger = new AtomicInteger(0);

    public AtomicInteger getAtomicInteger() {
        return atomicInteger;
    }

    public void setAtomicInteger(AtomicInteger atomicInteger) {
        this.atomicInteger = atomicInteger;
    }

    public int getCount() {
        return count;
    }

    public  void inc(int n) {

        for (int i = 0; i < n; i++) {
            count++;
            atomicInteger.getAndIncrement();

             System.out.println(Thread.currentThread().getName() + " " + this.getCount());

             try
             {
            System.out.println("count.getCount()");
             Thread.currentThread().sleep(1000);
             } catch (InterruptedException e) {
             e.printStackTrace();
             }
        }}



    public void printNumber(int n) {

        for (int i = 0; i < 10000; i++) {

            System.out.println(Thread.currentThread().getName() + "  " + i);
            // try {
            // System.out.println(count.getCount());
            // Thread.sleep(1000);
            // } catch (InterruptedException e) {
            // e.printStackTrace();
            // }
        }

    }

    public static void main(String[] args) throws InterruptedException {
        SyncEx count = new SyncEx();

        Thread t1 = new Thread(() -> {

            count.inc(10);
            // System.out.println(Thread.currentThread().getName()+" "+count.getCount());
            // try {
            // System.out.println(count.getCount());
            // Thread.sleep(1000);
            // } catch (InterruptedException e) {
            // e.printStackTrace();
            // }

        });

        Thread t2 = new Thread(() -> {

            // System.out.println(count.getCount()+"i got the lock");
            count.inc(10);
            // System.out.println(Thread.currentThread().getName()+" "+count.getCount());

        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("final answer" + count.getAtomicInteger() + " "+ count.getCount());

    }
}
