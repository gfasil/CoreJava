//Singly-linked lists are already defined with this interface:
 class ListNode<T> {
    T value;
    ListNode<T> next;
    ListNode(T x) {
     value = x;
   }

   static ListNode<Integer> insertValueIntoSortedLinkedList(ListNode<Integer> l, int value) {
            ListNode<Integer> nn=new ListNode<Integer>(value);

            if(l==null) return nn;
            if(l.value>nn.value)
            {
                nn.next=l;
                return nn;

            }
            ListNode<Integer> temp=l;
            while ((temp.next!=null&& l.next.value<nn.value)){

                temp=l.next;
            }
            ListNode<Integer> tt=temp.next;
            temp.next=nn;
            nn.next=tt;
            return l;
    }


    public static void main(String[] args) {

        ListNode<Integer>  node=new ListNode<Integer>(20);
      // ListNode.insertValueIntoSortedLinkedList(node,21);
        ListNode.insertValueIntoSortedLinkedList(node,24);

        System.out.println(node);

    }

    }




