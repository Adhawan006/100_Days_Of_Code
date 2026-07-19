package hundred_days_of_code.Day23;


import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }
}

public class MergeTwo {

    static Node insertLast(Node head, int data) {
        Node newNode = new Node(data);

        if (head == null)
            return newNode;

        Node temp = head;
        while (temp.next != null)
            temp = temp.next;

        temp.next = newNode;
        return head;
    }

    static Node merge(Node head1, Node head2) {
        Node merged = null;

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                merged = insertLast(merged, head1.data);
                head1 = head1.next;
            } else {
                merged = insertLast(merged, head2.data);
                head2 = head2.next;
            }
        }

        while (head1 != null) {
            merged = insertLast(merged, head1.data);
            head1 = head1.next;
        }

        while (head2 != null) {
            merged = insertLast(merged, head2.data);
            head2 = head2.next;
        }

        return merged;
    }

    static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Node head1 = null;

        for (int i = 0; i < n; i++)
            head1 = insertLast(head1, sc.nextInt());

        int m = sc.nextInt();
        Node head2 = null;

        for (int i = 0; i < m; i++)
            head2 = insertLast(head2, sc.nextInt());

        Node merged = merge(head1, head2);

        display(merged);

        sc.close();
    }
}