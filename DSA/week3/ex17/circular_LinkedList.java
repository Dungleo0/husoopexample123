package DSA.week3.ex17;

//{ Driver Code Starts

import java.util.*;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}


public class circular_LinkedList {
    Node head, head1, head2;  // head of lisl
    //Node last = null;
    Node last = null;

    /* Linked list Node*/


    /* Utility functions */

    /* Inserts a new Node at front of the list. */
    public void addToTheLast(Node node) {

        if (head == null) {
            head = node;

        } else {
            Node temp = head;
            while (temp.next != null)
                temp = temp.next;

            temp.next = node;
        }
    }

    /* Function to print linked list */
    void printList(Node node) {
        Node temp = node;
        if (node != null) {
            do {
                System.out.print(temp.data + " ");
                temp = temp.next;
            } while (temp != node);
        }
        System.out.println();
    }

    void circular() {
        last = head;
        while (last.next != null)
            last = last.next;
        last.next = head;
        //System.out.println(last);
    }


    /* Drier program to test above functions */
    public static void main(String args[]) {
       
         
        /* Constructed Linked List is 1->2->3->4->5->6->
           7->8->8->9->null */
        Scanner sc = new Scanner(System.in);

        {
            System.out.println("Nhap so Node de tao list: ");
            int n = sc.nextInt();
            System.out.println("nhap data Node");
            circular_LinkedList llist = new circular_LinkedList();
            int a1 = sc.nextInt();
            Node head = new Node(a1);
            llist.addToTheLast(head);
            for (int i = 1; i < n; i++) {
                int a = sc.nextInt();
                llist.addToTheLast(new Node(a));


            }
			 /*Node x = head;
			 while(x!=null)
			 {
				 System.out.print(x.data+" ");
				 x = x.next;
			 }*/
            llist.circular();
            //int k=sc.nextInt();
            gfg g = new gfg();
            llist.head1 = null;
            llist.head2 = null;
            g.splitList(llist);
            llist.printList(llist.head1);
            llist.printList(llist.head2);


        }
    }
}
// } Driver Code Ends


/* Node of a linked list
 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
*/

class gfg {
    // Function  to split a circular LinkedList
    void splitList(circular_LinkedList list) {

        Node head = list.head;
        Node head1 = null;
        Node head2 = null;

        Node midNode = head;
        Node checkNode = head;

        while (checkNode.next != head && checkNode.next.next != head) {
            midNode = midNode.next;
            checkNode = checkNode.next.next;
        }

        if (checkNode.next.next == head) {
            checkNode = checkNode.next;
        }

        head1 = head;
        head2 = midNode.next;

        midNode.next=head1;
        checkNode.next=head2;

        list.head1=head1;
        list.head2=head2;

    }
}