import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.*;
import java.util.function.Function;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class BalanceException extends Exception {
    String message;

    public BalanceException(String m) {
        super(m);

    }
    public String getMessage(){
        return this.message;
    }

}
class Customer   {

    double balance;
    int acc_no;
    String name;
   private static final  Logger log=Logger.getLogger(String.valueOf(Customer.class.getPackage()));

    public Customer(double balance, int acc_no, String name) {
        this.balance = balance;
        this.acc_no = acc_no;
        this.name = name;
    }
    public String deposit(double cash) throws BalanceException {
//        try{

            if(cash<=0) throw new BalanceException("invalid input");
            else balance+=cash;
            System.out.println("success");
            System.exit(1);
//        }
//        catch (BalanceException e){
//          //  System.out.println("wow");
//
//            e.getMessage();
//         return  "x";
//        }
//        finally {
//            System.out.println("finally block");
//        }
        return null;
    }
    public void withdraw(double cash) {
        try{

            if(cash<=0.0 || balance-cash<50) throw new BalanceException("not enough balance");
            else balance-=cash;
        }
        catch (BalanceException e){

            e.getMessage();
        }
    }

    Function<List<String>, Map> stringtomap=(list)->{
        Map<String,Long> map=new HashMap<>();
        Map<String,Long> res=  list.stream().filter(x->x.equalsIgnoreCase("eclipse")).map((str)->new AbstractMap.SimpleEntry<>(str,1)
/*
                 if(!map.containsKey(str)){
                     map.put(str,1L);
                 }
                 else {
                     Long count = map.get(str);
                     map.put(str, count + 1);
                 }*/


        ).collect(Collectors.groupingBy((x)->x.getKey(),Collectors.counting()));
      return res;
    };

    public static void main(String[] args) throws BalanceException  {
        Customer cust=new Customer(2000,123467,"fasil");
         String x=Arrays.asList(new String[]{"hello","hello","moto"}).
               stream().
                 distinct().
                 collect(Collectors.joining(","));
        System.out.println(x);



        Arrays.asList(new String[]{"eclipse","eclipse","he","lo","Eclipse","Eclipse","EClipse"})
                .stream().filter(w->w.equalsIgnoreCase("eclipse")).map((str)->new AbstractMap.SimpleEntry<>(str,1)

        ).collect(Collectors.groupingBy((z)->z.getKey(),Collectors.counting())).forEach( (k,v) ->System.out.println(k +"===== "+v));

//        Iterator<String> it=re.keySet().iterator();
//
//        while(it.hasNext()){
//
//            System.out.println(re +"===== "+re.get(it));
//        }
        cust.deposit(-500.00);
    }
    @Data
    @AllArgsConstructor
    class Pair{
        String str;
        Long count;
    }

}