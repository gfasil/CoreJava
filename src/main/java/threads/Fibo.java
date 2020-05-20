package threads;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class Fibo extends RecursiveTask<Integer> {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    final int n;

    Fibo(int n) {
        this.n = n;
    }

    @Override
    protected Integer compute() {
        // TODO Auto-generated method stub

        if (n <= 1)
            return n;

        Fibo f1 = new Fibo(n - 1);
        f1.fork();
        Fibo f2 = new Fibo(n - 2);
        f2.fork();
        return f2.join() + f1.join();
    }

    public static void main(String[] args) {
        Fibo f = new Fibo(6);
        ForkJoinPool pool=new ForkJoinPool(Runtime.getRuntime().availableProcessors());

        System.out.println(pool.invoke(f));
    }

}