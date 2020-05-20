package StringManup;

import com.google.common.collect.HashMultiset;

public class StringManEx1 {


    // removes non digit numbers
    public static String removerNonDigits(String input){
        input=input.replaceAll("[[^\\d][hello][9]]"," ");
        input=input.trim();
        input=input.replaceAll(" +"," ");

        return input;
    }

        public static boolean isAnangram(String input1,String input2){
                if(input1.length()!=input2.length()) return false;

                int[] count=new int[256];
            HashMultiset<Object> multi= HashMultiset.create();

            HashMultiset<Object> multi1= HashMultiset.create();
                for(int i=0;i<input1.length();i++){
                    count[input1.charAt(i)]++;
                    count[input2.charAt(i)]--;
                    // using hashmultiset
                    multi.add(input1.charAt(i));
                    multi1.add(input1.charAt(i));
                }

            for(int i=0;i<256;i++){
                if(count[i]!=0) return false;

            }


            return multi.equals(multi1);

        }

        public static int count(String s){
        if(s.length()==0) return 0;
        s=s.trim();
        int count=0;
        char[] x=s.toCharArray();
        char y=' ';
       for(int i=0;i<x.length;i++){

           if(x[i]==y) count++;
       }
        if(s.length()==0) return 0;
        return count-x.length;
  //      return s.split("[\\s+]").length;
        }
   static int firstDuplicate(int[] a) {
        int x=0;
       for(int i=0;i<a.length;i++)
       {
       if(a[Math.abs(a[i])-1]<0)
               return Math.abs(a[i]);
           else {
               a[Math.abs(a[i]) - 1] = -a[Math.abs(a[i]) - 1];
           }   }
       return -1;

    }

   static char firstNotRepeatingCharacter(String s) {
        if(s.length()<=0) return '_';
        char[] temp1=s.toCharArray();
        for(int i=0;i<temp1.length-1;i++){

            String temp=s.substring(i+1, s.length());
            System.out.println(temp +i);
            char x=s.charAt(i);
            System.out.println("index "+temp.indexOf(x));
            if(temp.indexOf(x)<0) return x;

        }

        return '_';
    }
    public static void main(String[] args) {

        System.out.println(StringManEx1.removerNonDigits("hellofasilIUUU999---- 12 22345 55u5u 9"));
        System.out.println("anagram "+StringManEx1.isAnangram("hello","he"));
        System.out.println("anagram "+StringManEx1.isAnangram("hello","hello"));
        System.out.println("anagram "+StringManEx1.isAnangram("hello","he"));
        System.out.println("anagram "+StringManEx1.isAnangram("hello","llohe"));
        System.out.println("count "+StringManEx1.count("hello llohe ds"));
    //    System.out.println(firstNotRepeatingCharacter("hehlleo")+" hello"+ firstDuplicate(new int[]{2, 4,4,2, 3, 5, 1}));
    }

}
