package hundred_days_of_code.Day24;

import java.util.Scanner;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class DeleteKey {
    static ListNode insert(ListNode head, int val) {
        ListNode newNode = new ListNode(val);

        if (head == null) {
            return newNode;
        }

        ListNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        return head;
    }

    static ListNode deleteNode(ListNode head, int key) {

        if (head == null) {
            return head;
        }

        if (head.val == key) {
            return head.next;
        }

        ListNode prev = null;
        ListNode current = head;

        while (current != null) {
            if (current.val == key) {
                prev.next = current.next;
                break;
            }

            prev = current;
            current = current.next;
        }

        return head;
    }

    static void display(ListNode head) {
        ListNode temp = head;

        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ListNode head = null;

        for (int i = 0; i < n; i++) {
            head = insert(head, sc.nextInt());
        }

        int key = sc.nextInt();

        head = deleteNode(head, key);

        display(head);

        sc.close();
    }
}
