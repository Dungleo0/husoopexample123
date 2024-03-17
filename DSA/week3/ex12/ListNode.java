package DSA.week3.ex12;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode cur = head;
        while (cur != null && cur.next != null) {
            if (cur.val == cur.next.val) {
                cur.next = cur.next.next;
            } else {
                cur = cur.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {

        ListNode head1 = new ListNode(1);
        ListNode head2 = new ListNode(1);
        ListNode head3 = new ListNode(2);
        ListNode head4 = new ListNode(3);
        ListNode head5 = new ListNode(4);
        ListNode head6 = new ListNode(4);

        head1.next=head2;
        head2.next=head3;
        head3.next=head4;
        head4.next=head5;
        head5.next=head6;

        ListNode temp = head1;

        Solution solution = new Solution();
        System.out.println("List Node");
        while (head1 != null) {
            System.out.print(head1.val + " ");
            head1 = head1.next;
        }

        ListNode result = solution.deleteDuplicates(temp);


        System.out.print("\nResult: ");
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}

