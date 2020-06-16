package collection;

// Definition for singly-linked list.
 public class ListNode {
    int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

class Solution {

    public static int reverseNumber(int input){
        System.out.println(input);
        if(input<10) return input;
        int res=0;
        while(input>0){
            res*=10;
            res+=input%10;
            input=input/10;
        }
       // System.out.println(res);
        return res;
    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode tempL1=l1;
        ListNode tempL2=l2;
        int result1=0;
        int result2=0;
        while(tempL1!=null){
            result1*=10;
            result1+=tempL1.val;


            tempL1=tempL1.next;

        }
        while(tempL2!=null){

            result2*=10;
            result2+=tempL2.val;
            tempL2=tempL2.next;

        }
        System.out.println(result1);
        int sum=reverseNumber(result1)+reverseNumber(result2);
     //   System.out.println(sum);
        ListNode nn=new ListNode(sum%10);
        ListNode head=nn;
        nn.next=null;
        sum/=10;
        while(sum>0){
            ListNode nnNext=new ListNode(sum%10);
            head.next=nnNext;
            sum/=10;
            head=head.next;

        }
        return nn;
    }
    public static int compareVersion(String version1, String version2) {

        String[] v1=version1.split("\\.");
        String[] v2=version2.split("\\.");

        int i=0,j=0;
        while(i<v1.length || j<v2.length){

            int n1=i<v1.length?Integer.parseInt(v1[i]):0;
            int n2=j<v2.length?Integer.parseInt(v2[j]):0;


            if(n1>n2) return 1;
            else if(n1<n2) return -1;

            i++;
            j++;
        }

        return 0;
    }



    public static void main(String[] args) {
        System.out.println(compareVersion("1.0.1","1"));
        ListNode node=new ListNode(1,new ListNode(8));
       ListNode n=addTwoNumbers(node
             ,new ListNode(0));

        System.out.println(n.next.val);
    }
}
