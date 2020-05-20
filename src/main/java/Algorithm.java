import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Algorithm {

    // reverse linkedlist
    static Node head;

    static class Node {

        int data;
        Node next, prev;

        Node(int d) {
            data = d;
            next = prev = null;
        }
    }

    void reverse(){
        Node temp=null;
        Node current=head;

        while(current!=null){
            temp=current.prev;// for curren. next
            current.prev=current.next;
            current.next=temp;
            current=current.prev;
        }

        if(temp!=null){
            head=temp.prev; // cause temp is always one step forward of the head
        }

    }
    void push(int new_data) {
        /* allocate node */
        Node new_node = new Node(new_data);

        /* since we are adding at the beginning,
         prev is always NULL */
        new_node.prev = null;

        /* link the old list off the new node */
        new_node.next = head;

        /* change prev of head node to new node */
        if (head != null) {
            head.prev = new_node;
        }

        /* move the head to point to the new node */
        head = new_node;
    }

    /* Function to print nodes in a given doubly linked list
     This function is same as printList() of singly linked list */
    void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    public void printSumPairs(int arr[], int sum){
            Set<Integer> set=new HashSet<>();

            for(int i=0;i<arr.length;i++){
                int temp=sum-arr[i]; // temp+arr[i]=sum
                if(set.contains(temp)){
                    System.out.println("Pair with given sum " + sum + " is (" + arr[i] + ", " + temp + ")");
                }
                set.add(temp);
            }

    }
    public boolean printSumPairs1(int arr[], int sum) {

        Arrays.sort(arr);
        int init=0;
        int last=arr.length-1;
        while(init<last){
            if(arr[init]+arr[last]==sum) return true;
            else if(arr[init]+arr[last]>sum){
                last--;
            }
            else init++;
        }

    return false;
    }

    // merge sort

}
