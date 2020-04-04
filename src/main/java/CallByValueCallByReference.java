package main.java;

public class CallByValueCallByReference {

public static void add(int x){

    x++;
    System.out.println(x);

}
    public static void main(String[] args) {

    int y=20;
        CallByValueCallByReference.add(y);
        System.out.print("the value of y is "+y);
    }
}
