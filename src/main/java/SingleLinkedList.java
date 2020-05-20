public class SingleLinkedList {


    static Node head;

    static class Node {

        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }
public void removeDup(){
        Node ptr1=null,ptr2=null, dup=null;
        ptr1=head;
        while(ptr1!=null&&ptr1.next!=null){
            ptr2=ptr1;
            while(ptr2.next!=null){

                if(ptr1.data==ptr2.next.data){

                    dup=ptr2.next;
                    ptr2.next=ptr2.next.next;
                    System.gc();
                }
                else{
                    ptr2=ptr2.next;
                }
            }
            ptr1=ptr1.next;

        }
    }
}
