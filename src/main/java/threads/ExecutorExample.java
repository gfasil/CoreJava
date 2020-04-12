package threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ExecutorExample {


    public static void main(String[] args) {
        ExecutorService executorService= Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        ScheduledExecutorService executorService1= Executors.newScheduledThreadPool(10);
        executorService1.schedule(()->{
            System.out.println("NORMAL SCHEDULE");

        },15, TimeUnit.SECONDS);

        executorService1.scheduleAtFixedRate(()->{
            System.out.println("FIXED RATE SCHEDULE SCHEDULE");

        },15,10, TimeUnit.SECONDS);
        executorService1.scheduleWithFixedDelay(()->{
            System.out.println("DELAYED SCHEDULE");

        },15,10, TimeUnit.SECONDS);
        System.out.println( Runtime.getRuntime().availableProcessors());
        for(int i=0;i<10;i++){

            executorService.execute(()->{
                System.out.println(Thread.currentThread().getName()+ Runtime.getRuntime().availableProcessors());

            });
        }
    }

}


