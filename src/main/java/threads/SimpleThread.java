package threads;

import java.util.logging.Level;
import java.util.logging.Logger;

public class SimpleThread extends Thread  {

    int[] x={10,20,50,607,70,10,20};

    public SimpleThread() {
        super();
    }

    public void run()   {

        assert x.length>0:"invalid input";

        for ( int i=0;i<x.length;i++){
            try{
                System.out.println(x[i]*10);
        //       Thread.sleep(3000);
            }
            catch (Exception
                    e){

                e.printStackTrace();
            }

        }

    }

    public static void main(String[] args) throws InterruptedException{
        Thread t1=new SimpleThread();


        Thread t2= new Thread(new SimpleThread().new MyThread());
        t1.start();
        t2.start();
        t2.setPriority(Thread.MIN_PRIORITY);
        t1.setPriority(Thread.MAX_PRIORITY);
        System.out.println(t1.getName() +  t2.isInterrupted() + t1.getPriority());
     //   t2.join();
       // t1.join();


        System.out.println(t2.getName() +  t2.isAlive());


    }
//create a thread using Runnable
    class MyThread implements Runnable{


        @Override
        public void run() {

            for(int i=0;i<5;i++){

                try {
                    System.out.println("hello" + i );
            //        Thread.sleep(3000);
                } catch (Exception e) {
                    Logger.getLogger(MyThread.class.getName()).log(Level.ALL,null,e);
                    e.printStackTrace();
                }
            }

        }
    }
}
