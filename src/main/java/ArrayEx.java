import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public abstract class ArrayEx {

    public static <T> T[] findDuplicate(T[] input) {
        assert input.length < 0 : "array is empty";
        if (input != null) {
            Set<T> inputlist = new HashSet<>();
            boolean flag = false;
            for (T temp : input) {

                if (inputlist.contains(temp)) {

                    flag = true;
                    System.out.println("duplicate found " + temp);
                } else {
                    inputlist.add(temp);
                }
            }
            if (!flag) {
                System.out.println("no duplicates found ");
            }
            return (T[]) inputlist.toArray();
        }

        return null;
    }
    //chcke if a string has all characters in the alphabet
public boolean panagram(String input){
        int[]  chars=new int[26];
        String temp=input.toLowerCase().trim();

        for(int i=0;i<temp.length();i++){

            chars[temp.charAt(i)-'a']++;
        }

        for(int x:chars){
            if(x<=0) return false;
        }
        return true;
}
// back tracking
public int pow(int x,int y){

        if(y==0) return 1;
        if(y%2==0) return pow(x,y/2)*pow(x,y/2);
        else  return x*pow(x,y/2)*pow(x,y/2);
}
    // back tracking
    public int pow1(int x,int y){

        if(y==0) return 1;
        int temp=pow(x,y/2);
        if(y%2==0) return temp*temp;
        else  return x*temp*temp;
    }

    public static String reverse(String input){
      if(input.isEmpty())return input;
        else return reverse(input.substring(1))+input.charAt(0);
    }
public boolean palondrome(String i2){
        if(i2.isEmpty())return false;
    Stack<Character> temp=new Stack<>();

    for(int i=0;i<i2.length();i++){
        temp.push(i2.charAt(i));
    }
    for(int i=i2.length()-1;i>=0;i--){
       char x=temp.pop();
       if(i2.charAt(i)!=x) return false;
    }
        return true;

}
public static int[] zerosOnes(int input[]){
        int[] temp=new int[input.length];
        int i=0,j=input.length-1,k=0,zeros=0,ones=0;
            while(i<=j){
              if(input[k]==0){
                  temp[i]=0;
                  i++;
                  zeros++;

              }
              else {
                  temp[j]=1;
                  j--;
                  ones++;
              }
              k++;
            }
            System.out.println(Arrays.toString(temp) + " "+ zeros);
            return temp;


}
// blanagram

public static boolean onEditReplace(String s1,String s2){

        boolean found=false;
        for(int i=0;i<s1.length();i++){

            if(s1.charAt(i)!=s2.charAt(i)){
                if(found) return false;
            }
            found=true;
        }
        return true;

}
// check if you insert one character in s1 to get s2
    public static boolean insertOne(String s1,String s2){
        int index1=0;
        int index2=0;
        while(index1>s1.length()&&index2<s2.length()){

            if(s1.charAt(index1)!=s2.charAt(index2)){
                if(index1!=index2) return false;
                index2++;
            }
            else {
                index1++;
                index2++;
            }
        }
        return true;
    }

public static boolean oneWay(String input1, String input2){
      if(input1.length()==input2.length()) return onEditReplace(input1,input2);
    if(input1.length()+1==input2.length()) return insertOne(input1,input2);
    if(input1.length()-1==input2.length()) return insertOne(input2,input1);
    return false;
}
// string compression

    public String compress(String s1){
        StringBuilder builder=new StringBuilder();// create builder for new string
        int count=0; // counter to count number of occurance of a char
        for(int i=0;i<s1.length();i++){
            count++;// whenever you iterate, you add count of that char
            //check if 1+1 element is not equal
            if(i+1>=s1.length()||s1.charAt(i)!=s1.charAt(i+1)){
                builder.append(s1.charAt(i));//append the char
                builder.append(count);//append the number of count
                count=0;
            }
        }
        return builder.length()<s1.length()?s1:builder.toString();
    }


    public static void main(String[] args) {

        System.out.println(Arrays.toString(findDuplicate(null)));
        System.out.println("\ud837\udd6c" + reverse("hello world,"));
        System.out.println("\ud837\udd6c" + zerosOnes(new int[]{0,1,1,0,1,0,1}));

    }


}
