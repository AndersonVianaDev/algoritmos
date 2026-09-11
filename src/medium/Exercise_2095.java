package medium;

class ListNode2095 {
    int val;
    ListNode2095 next;
    ListNode2095() {}
    ListNode2095(int val) { this.val = val; }
    ListNode2095(int val, ListNode2095 next) { this.val = val; this.next = next; }

    @Override
    public String toString() {
        return "ListNode2095{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}


public class Exercise_2095 {
    public static ListNode2095 deleteMiddle(ListNode2095 head) {
        if(head == null || head.next == null) {
            return null;
        }

        ListNode2095 fast=head, slow=head, prev=head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        while (prev.next != slow) {
            prev = prev.next;
        }

        prev.next = slow.next;

        return head;
    }

    public static void main(String[] args) {
        ListNode2095 node7 = new ListNode2095(7);
        ListNode2095 node6 = new ListNode2095(6, node7);
        ListNode2095 node5 = new ListNode2095(5, node6);
        ListNode2095 node4 = new ListNode2095(4, node5); // remover
        ListNode2095 node3 = new ListNode2095(3, node4);
        ListNode2095 node2 = new ListNode2095(2, node3);
        ListNode2095 node1 = new ListNode2095(1, node2);

        System.out.println(deleteMiddle(node1));

        ListNode2095 nodenew2 = new ListNode2095(1);
        ListNode2095 nodenew1 = new ListNode2095(2, nodenew2);

        System.out.println(deleteMiddle(nodenew1));

        ListNode2095 nodenew = new ListNode2095(1);
        System.out.println(deleteMiddle(nodenew));
    }
}
