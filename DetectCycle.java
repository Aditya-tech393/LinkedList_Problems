class ListNode {
    int value;
    ListNode next;

    ListNode(int value) {
        this.value = value;
        this.next = null;
    }
}
public class DetectCycle {

    public static ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return slow;
            }
        }
        return null;
    }


    public static ListNode detectFirstNode(ListNode head) {
        ListNode meet = detectCycle(head);
        if (meet == null) {
            return null;
        }

        ListNode start = head;
        while (start != meet) {
            start = start.next;
            meet = meet.next;
        }
        return start;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(10);
        head.next = new ListNode(20);
        head.next.next = new ListNode(30);
        head.next.next.next = new ListNode(40);
        head.next.next.next.next = new ListNode(50);
        head.next.next.next.next.next = new ListNode(60);


        head.next.next.next.next.next.next = head.next.next;

        ListNode startOfCycle = detectFirstNode(head);
        if (startOfCycle != null) {
            System.out.println("Cycle detected starting at node with value " + startOfCycle.value);
        } else {
            System.out.println("No cycle detected");
        }
    }
}