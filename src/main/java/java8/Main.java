package java8;

import java.util.function.Consumer;

public class Main {

    public static void example(Consumer<Integer> consumer){

        consumer.accept(20);
    }

    public static void main(String[] args) {

        example(Util::sum);
        example(Util::mul);
    }
}

class Util{

    public static void mul(Integer input){

        System.out.println(input*2);
    }
    public static void sum(Integer input){

        System.out.println(input+2);
    }
}
