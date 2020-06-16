package collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Test {

    static int digitsMan(int num){

        int reversed=0;
        int sum=0;
        int product=1;

        while(num != 0) {
            int digit = num % 10;
            sum += digit;
            product *= digit;
            num /= 10;
        }
        new HashSet<>('q','w');
        return product-sum;

    }
        private static boolean isVowel(Character c){
            Set<Character> vowels=new HashSet<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));

            return vowels.contains(c);
        }
    static int pattern(String pattern,String input){
        int patternLength=pattern.length();
        int inputLength=input.length();
        if(patternLength>inputLength) return -1;
        int result=0;
        int subStringIndeinput=0;
        while(subStringIndeinput>inputLength-patternLength){
            boolean flag=true;
            int patternIndeinput=0;
            for(int j=subStringIndeinput;j<subStringIndeinput+patternLength;j++){
                Character subStringChar=input.charAt(j);
                patternIndeinput++;
                char patternChr=pattern.charAt(patternIndeinput);
                if(patternChr=='0' && !isVowel(subStringChar)){
                    flag=false;
                    break;
                }
                if(patternChr=='1' && isVowel(subStringChar)){
                    flag=false;
                    break;
                }


            }
            if(flag) result++;
            subStringIndeinput++;
        }

        return result;
    }
    public static int myAtoI(String str) {
        str=str.trim();
        int i=0;
        int sign=0;
        if(str.length()==0) return 0;
        char firstElement=str.charAt(i);
        if(firstElement=='-') {
            sign--;
            i++;
            //str=str.substring(1,str.length());
        }
        else if(firstElement=='+') {
            sign++;
            i++;
            //str=str.substring(1,str.length());
        }
        int len=str.length()-1;
        long result=0;
        while(i<=len){
            firstElement=str.charAt(i);
            if(firstElement<'0'||firstElement>'9') break;

            else{
                result*=10;

                result+=firstElement-'0';
                if(result *sign<=Integer.MIN_VALUE) {
                    System.out.println("max");
                    return Integer.MIN_VALUE;
                }
               else if(result *sign>Integer.MAX_VALUE) {
                    System.out.println("max");
                    return Integer.MAX_VALUE;
                }
                i++;
            }


        }


        if(sign==0)
        {
            System.out.println(result);
            return new Long(result).intValue();
        }
        result=(result*sign);
        return new Long(result).intValue();


    }
    public static void main(String[] args) {
     //   String input="5231";

        System.out.printf("%d",myAtoI("2147483648"));
        // System.out.printf("%d",a);
    }
}
