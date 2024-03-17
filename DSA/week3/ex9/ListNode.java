package DSA.week3.ex9;


public class ListNode {
    Node head;


    public ListNode() {
        this.head = null;

    }

    public void append(Node node) {
       Node cur = head;
        if (head == null) {
            head = node;
        } else {
            while (cur.next != null) {
                cur = cur.next;
            }
            cur.next = node;
        }

    }

    public void printList() {
        Node cur = head;
        while (cur != null) {
            System.out.print(cur + " ");
            cur = cur.next;
        }
    }

    public static int count(Node head, int key)
    {
        Node cur = head;
        int count=0;
        while(cur!= null){
            if(cur.data==key){
                count++;
            }
            cur=cur.next;
        }
        return count;
        //code here
    }
}
