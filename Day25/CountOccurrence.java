package hundred_days_of_code.Day25;

import java.util.Scanner;

public class CountOccurrence {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    static class Solution {

        public int countOccurrences(ListNode head, int key) {

            int count = 0;

            while (head != null) {

                if (head.val == key) {
                    count++;
                }

                head = head.next;
            }

            return count;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ListNode head = null;
        ListNode tail = null;

        for (int i = 0; i < n; i++) {

            int value = sc.nextInt();
            ListNode newNode = new ListNode(value);

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        int key = sc.nextInt();

        Solution obj = new Solution();

        System.out.println(obj.countOccurrences(head, key));

        sc.close();
    }
}