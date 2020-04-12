public class examples {
     int x;
    {

        x=20;
    }
    public static void main(String[] args) {
        // new User();}
        /*
         * for(int i=5;i>=1; i--) {
         * 
         * for(int j = 5; j>=0; j--){ System.out.print("*");
         * 
         * } System.out.print(" "); System.out.println(); }
         */
        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        String s = "hello,how,are,you,today";
        String[] parsedVals = s.split(",");

        for (String temp : parsedVals) {
            System.out.println(temp);

        }
    }

}
