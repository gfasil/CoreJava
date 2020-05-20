package innerclass;

public class SingletonAsInnerClass {

    static class InstanceHolder{
        private static  SingletonAsInnerClass INSTANCE=new SingletonAsInnerClass();

    }
    private SingletonAsInnerClass(){
        System.out.println("constructing now...");
    }
    public static  SingletonAsInnerClass getInstance(){
        return InstanceHolder.INSTANCE;
    }
    public static void main(String[] args) {
        System.out.println("Main method first call");
        // comment out and you see the instance is not created
        SingletonAsInnerClass.getInstance();
        System.out.println("Try to get the singleton instance again...");
        SingletonAsInnerClass.getInstance();
    }

}
