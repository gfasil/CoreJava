package threads;

public class SyncEx {

   volatile int count;
        public int  getCount(){return count;}

        public synchronized void inc() {
     count++;
    }


    public static void main(String[] args) throws InterruptedException {
        SyncEx count=new SyncEx();
        Thread t1=new Thread(()->{
            for (int i = 0; i < 1000; i++)
            {
                count.inc();
            }



        });

        Thread t2=new Thread(()->{
            for (int i = 0; i < 1000; i++)
            {
                count.inc();
            }



        });
        t1.start();

        t2.start();
        t1.join();
        t2.join();
        System.out.println(count.getCount());

    }
}
