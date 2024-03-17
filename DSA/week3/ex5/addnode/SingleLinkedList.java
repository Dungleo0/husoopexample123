package DSA.week3.ex5.addnode;

public class SingleLinkedList {

    private Node head;
    private int size;

    public SingleLinkedList() {
        head = null;
    }

    public int get(int index) {
        if (index >= size || index < 0){
            return -1;
        }

        Node temp = head;
        for (int i = 0; i < index; i++)
            temp = temp.next;
        return temp.data;
    }


    public void addAtHead(int val) {
        Node newHead = new Node(val);
        newHead.next = head;
        head = newHead;
        size++;
    }

    public void printNode(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp+" ");
            temp=temp.next;
        }
        System.out.println();
    }
}
