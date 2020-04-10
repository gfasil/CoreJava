
import java.util.Scanner;

public class Example1 {

    public static void main(String args[]) {
        int x = 0;

        while (x < 10) { // condtion

            System.out.println(x);// operation

            // if(x==5) continue; // break statement
            // x++;// iteration

        }

        for (int i = 0; i < 5; ++i) {
            for (int j = 0; j <= i; ++j) {
                System.out.print("*");
            }
            System.out.println();
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("Pick an integer in the range 1..9");
        int val = sc.nextInt();
        System.out.println();
        switch (val) {
            case 90:
                System.out.println("you got A.");
                break;
            case 80:
                System.out.println("you got B.");
                break;
            case 70:
                System.out.println("you got B-.");
                break;
            case 60:
                System.out.println("you got c.");
                break;
            default:
                System.out.println("your grade is below 60. its a fail");
        }

    }
}
