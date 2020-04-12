import java.util.logging.Logger;

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
    public String deposit(double cash) {
        try{

            if(cash<=0) throw new BalanceException("invalid input");
            else balance+=cash;
            System.out.println("success");
            System.exit(1);
        }
        catch (BalanceException e){
          //  System.out.println("wow");

            e.getMessage();
         return  "x";
        }
        finally {
            System.out.println("finally block");
        }
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

    public static void main(String[] args)  {
        Customer cust=new Customer(2000,123467,"fasil");

    cust.deposit(-500.00);





    }
}