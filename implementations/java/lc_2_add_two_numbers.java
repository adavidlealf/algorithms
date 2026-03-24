class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class lc_2_add_two_numbers {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode() {}
     * ListNode(int val) { this.val = val; }
     * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int suma = l1.val + l2.val;
        ListNode rta = new ListNode((suma) % 10);
        if (l1.next == null && l2.next == null) {
            if (suma >= 10)
                rta.next = new ListNode(1);
        } else {
            l1.next = l1.next == null ? new ListNode() : l1.next;
            l2.next = l2.next == null ? new ListNode() : l2.next;
            l1.next.val = (l1.next == null ? 0 : l1.next.val) + (l2.next == null ? 0 : l2.next.val)
                    + (suma >= 10 ? 1 : 0);
            l2.next.val = 0;
            rta.next = addTwoNumbers(l1.next, l2.next);
        }
        return rta;
    }

    public static void main(String[] args) {
        // ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        // ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        ListNode l1 = new ListNode(9, new ListNode(9,
                new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9)))))));
        ListNode l2 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))));
        ListNode rta = addTwoNumbers(l1, l2);
        System.out.println("final");
    }

}
