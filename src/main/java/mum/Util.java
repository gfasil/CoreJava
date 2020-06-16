package mum;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.stream.Stream;

public class Util {

    public int compareEmployees(Employee1 e1, Employee1 e2) {
        return e1.getName().compareTo(e2.getName());
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Employee1> emps=new ArrayList<>();
//        Util u=new Util();
//        emps.sort(u::compareEmployees);
//        Collections.sort(emps,u::compareEmployees);

//        CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(() -> "Knolders!");
////        CompletableFuture<String> result= completableFuture.thenApply(value -> "hello " +value);
////       String x= result.get();
////        System.out.println(x);
        CompletableFuture<String> completableFuture
                = CompletableFuture.supplyAsync(() -> "Knolders!");
        CompletableFuture<Void> result
                = completableFuture.thenRun(() -> System.out.println("Example with thenRun().")).thenAccept(System.out::println);
        result.get();

        Optional<String> s= Optional.of("hello");
        Optional<Integer> in=s.filter(x->x.length()>0).map(x->x.length());
        Stream<Employee1> em=emps.stream();
     }
}

@Data
class Employee1{

    String name;
}
