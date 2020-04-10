
import java.util.Scanner;

public class CallByValueCallByReference {

    public static void add(int x) {

        x++;
        System.out.println(x);

    }

    public static void main(String[] args) {

        int y = 20;
        CallByValueCallByReference.add(y);
        System.out.print("the value of y is " + y);
        //
        // Scanner scanner=new Scanner(System.in);
        // int N = scanner.nextInt();
        // scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        // for (int i=1;i<=10;i++){
        //
        // System.out.printf("%d x %d = %d%n", N,i, N*i);
        // }
        // scanner.close();

        // System.out.println("================================");
        // for(int i=0;i<3;i++)
        // {
        // String s1=sc.next();
        // int x=sc.nextInt();
        // //Complete this line
        // System.out.printf("%-15s %03d %n",s1,x);
        // }
        // System.out.println("================================");

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int sum = a + (1 * b);
            int k = 2;
            System.out.print(sum + " ");
            for (int j = 0; j < n - 1; j++) {

                sum = sum + (k * b);
                k *= 2;
                System.out.print(sum + " ");
                // Math.pow(2,3);
            }
            System.out.println();
        }
        in.close();
    }
}
