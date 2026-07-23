package hundred_days_of_code.Day27;

import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Intersection {

    static Node insert(Node head, int data) {
        Node newNode = new Node(data);

        if (head == null)
            return newNode;

        Node temp = head;
        while (temp.next != null)
            temp = temp.next;

        temp.next = newNode;
        return head;
    }

    static void findIntersection(Node head1, Node head2) {
        Node p = head1;

        while (p != null) {
            Node q = head2;

            while (q != null) {
                if (p.data == q.data) {
                    System.out.println(p.data);
                    return;
                }
                q = q.next;
            }

            p = p.next;
        }

        System.out.println("No Intersection");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Node head1 = null;

        for (int i = 0; i < n; i++) {
            head1 = insert(head1, sc.nextInt());
        }

        int m = sc.nextInt();
        Node head2 = null;

        for (int i = 0; i < m; i++) {
            head2 = insert(head2, sc.nextInt());
        }

        findIntersection(head1, head2);

        sc.close();
    }
}
