package hundred_days_of_code.Day21;

import java.util.Scanner;

public class TraverseLinkedList {

    private Node head;
    private Node tail;
    private int size;

    private class Node {

        int value;
        Node next;

        Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public void insert(int value) {

        Node node = new Node(value);

        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }

        size++;
    }

    public void display() {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        TraverseLinkedList list = new TraverseLinkedList();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        System.out.print("Enter " + n + " nodes: ");

        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            list.insert(value);
        }

        list.display();

        sc.close();
    }
}