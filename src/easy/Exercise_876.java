package easy;

class ListNode876 {
    int val;
    ListNode876 next;
    ListNode876() {}
    ListNode876(int val) { this.val = val; }
    ListNode876(int val, ListNode876 next) { this.val = val; this.next = next; }

    @Override
    public String toString() {
        return "ListNode876{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}

public class Exercise_876 {

    public static ListNode876 middleNode(ListNode876 head) {
        ListNode876 ahead = head;

        while (ahead != null && ahead.next != null) {
            ahead = ahead.next.next;
            head = head.next;
        }

        return head;
    }

    public static void main(String[] args) {
        ListNode876 node6 = new ListNode876(6);
        ListNode876 node5 = new ListNode876(5, node6);
        ListNode876 node4 = new ListNode876(4, node5);
        ListNode876 node3 = new ListNode876(3, node4);
        ListNode876 node2 = new ListNode876(2, node3);
        ListNode876 node1 = new ListNode876(1, node2);

        System.out.println(middleNode(node1));
    }


}
