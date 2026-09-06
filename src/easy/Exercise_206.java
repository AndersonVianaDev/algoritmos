package easy;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class Exercise_206 {

    public static ListNode reverseList(ListNode head) {
        ListNode newList = null;

        while (head!=null) {
            ListNode nextNode = head.next;
            head.next = newList;

            newList = head;
            head = nextNode;
        }

        return newList;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        ListNode newList = reverseList(node1);

        ListNode node = newList;
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        };
    }
}
