package DSA.week3.ex16;


class Node {
    Node next;
    int data;

    public Node(int data) {
        this.data = data;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        Node node1 = new Node(10);
        Node node2 = new Node(20);
        Node node3 = new Node(30);

        node1.next = node2;
        node2.next = node3;
        node3.next = node1;

        System.out.println("Printing circular linked list:");
        sol.printList(node1);
        System.out.println();

        System.out.println("--------------------------------------");

//• Kiểm tra một danh sách có là danh sách liên kết vòng không
        GfG ex2 = new GfG();
        System.out.println(ex2.isCircular(node1));

        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);

        n1.next = n2;
        n2.next = n3;

        System.out.println(ex2.isCircular(n1));

        System.out.println("================================");

        Chop s3 = new Chop();
        Node tmp=s3.sortedInsert(node1, 15);
        s3.printList(tmp);
    }
}

// Duyệt danh sách liên kết vòng
class Solution {
    /* Function to print nodes in a given Circular linked list */
    void printList(Node head) {
        // Your code here
        Node temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
    }
}

// • Kiểm tra một danh sách có là danh sách liên kết vòng không
class GfG {
    boolean isCircular(Node head) {
        // Your code here
        Node cur = head;

        while (cur.next != head) {
            if (cur.next == null) {
                return false;
            }
            cur = cur.next;
        }
        return true;
    }
}

// • Thêm phần tử vào danh sách liên kết vòng tăng dần
class Chop {

    public Node sortedInsert(Node head, int data) {

        Node cur = head;            // 3
        Node prev = new Node(data);// 1 2 3 4 5
                       //     c
            if (cur.data > data){

                prev.next=cur;
                do {
                    cur=cur.next;
                }while (cur.next != head);
                cur.next=prev;
            }else {
                do {
                    if (cur.next.data >= data){
                        prev.next=cur.next;
                        cur.next=prev;
                        break;
                    }else {
                        do {
                            cur=cur.next;
                        }while (cur.next!=head);
                        cur.next=prev;
                        prev.next=head;
                    }
                    cur=cur.next;
                }while (cur != head);
            }

        return (data< head.data)? prev: head;
    }

    void printList(Node head) {
        // Your code here
        Node temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
    }

}