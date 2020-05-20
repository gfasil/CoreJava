package innerclass;

enum  TestSingleton{
    INSTANCE; // It is a keyword. Works like a private constructor.
    int i;
    public void printHello() {
        System.out.println("i = " + i);
    }
}

//See how it works
public class SingletonAsEnum {
    public static void main(String[] args) {
        TestSingleton ob1 = TestSingleton.INSTANCE;
        ob1.i = 10;
        ob1.printHello();
        TestSingleton ob2 = TestSingleton.INSTANCE;
        ob2.i = 15;
        System.out.println(ob2.hashCode() +"---"+ob1.hashCode());
        ob1.printHello();
        TestSingleton ob3 = TestSingleton.INSTANCE;
        ob3.i = 20;
        ob1.printHello();

    }
}