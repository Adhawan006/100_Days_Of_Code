package hundred_days_of_code.Day22;

public class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {

        public ListNode reverseList(ListNode head) {

        ListNode current = head;
        ListNode prev = null;
        ListNode next = null;

        while (current != null) {

            // 1 -> 2 -> 3 -> 4 -> 5

            next = current.next;

            current.next = prev;

            prev = current;

            current = next;
        }

        return prev;
    }
}