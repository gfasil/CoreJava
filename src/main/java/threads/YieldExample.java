package threads;

import java.util.Vector;

public class YieldExample
{
    public static void main(String[] args)
    {

        Vector<Integer> sharedQueue=new Vector<>();
        int size=4;
        Thread producerThread = new Thread(new Producer(sharedQueue,size),"Producer");
        Thread consumerThread = new Thread(new Consumer(sharedQueue,size),"Consumer" );

        producerThread.setPriority(Thread.MIN_PRIORITY); //Min Priority
        consumerThread.setPriority(Thread.MAX_PRIORITY); //Max Priority
        producerThread.start();
        consumerThread.start();
        Thread hook = new Thread(()->
           System.out.println("shutting down")
        );

        Runtime.getRuntime().addShutdownHook(hook);
     //   System.exit(1);
    }
}

class Producer implements Runnable
{
    private final Vector<Integer> sharedQueue;
    private final int size;

    public Producer(Vector<Integer> sharedQueue, int size) {
        this.sharedQueue = sharedQueue;
        this.size=size;
    }

        @Override
    public void run()
    {
        for (int i = 0; i < 7; i++)
        {
            System.out.println("I am Producer : Produced Item " + i);
            try{
                produce(i);
            }
            catch (InterruptedException e){
                e.getMessage();
            }

        //    Thread.yield();
        }
    }

    private void produce(int i) throws InterruptedException{

        while(sharedQueue.size()==size){
            synchronized (sharedQueue){
                System.out.println("Queue is full " + Thread.currentThread().getName()
                        + " is waiting , size: " + sharedQueue.size());

                sharedQueue.wait();

            }
        }
        synchronized (sharedQueue){
            sharedQueue.add(i);
            sharedQueue.notifyAll();
        }
    }

}

class Consumer implements Runnable
{
    private final Vector<Integer> sharedQueue;
    private final int size;

    public Consumer(Vector<Integer> sharedQueue, int size) {
        this.sharedQueue = sharedQueue;
        this.size=size;
    }
    public void run()
    {
       while(true){
           try{

           System.out.println("Consumed: " + consume());
           Thread.sleep(50);

           }
           catch (InterruptedException ignored){

           }
       }
    }

    private Integer consume() throws InterruptedException {
        while (sharedQueue.isEmpty()){
            synchronized (sharedQueue){
                System.out.println("Queue is empty " + Thread.currentThread().getName()
                        + " is waiting , size: " + sharedQueue.size());

                sharedQueue.wait();

            }
        }
        synchronized (sharedQueue){
            sharedQueue.notifyAll();
            return sharedQueue.remove(0);
        }
    }
}