package StringManup;

import java.util.Random;

public class Example12 {

    public static String solution(String input){
        StringBuilder output=new StringBuilder("");
        for(int i=0;i<input.length();i++){
            char isquestion=input.charAt(i);
            if(isquestion=='?'){

                char rep;
                char left=input.charAt(i-1);
                left+=1;
                char right=input.charAt(i+1);

                if(i==input.length()-1) rep=left;

                if(left!=input.charAt(i+1)){
                    rep=left;
                }
                else {
                    rep=right;
                    rep++;
                }
             input=  input.replace(isquestion,rep);
          //  output.append(rep);
            }
            //output.append(isquestion);

        }
        return input;
    }

    public static String solution2(String s){
        char[] output=new char[s.length()];
        Random rnd = new Random();
        int k=-1;
        for(int i=0; i<s.length();i++){
            k++;
            char temp=s.charAt(i);
            if(temp!='?'){
                output[k]=temp;
            }
            else {
                char rep = (char) (rnd.nextInt(26) + 'a');

                if(i==s.length())   while(rep==output[k]){
                    rep=(char) (rnd.nextInt(26) + 'a');
                }
                else{
                    while(rep==temp || rep==output[k]){
                        rep=(char) (rnd.nextInt(26) + 'a');
                    }
                }
                output[k]=rep;
            }
        }

        return String.valueOf(output);

    }

    public static void main(String[] args) {
        System.out.println(solution2(" "));
    }
}
