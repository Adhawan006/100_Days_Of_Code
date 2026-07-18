package hundred_days_of_code.Day22;

public class countNodes {

    static class ListNode {
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
    public static void main(String[] args) {
        ListNode head = new ListNode(10);
         head.next = new ListNode(20);
        head.next.next = new ListNode(30);

        countNodes obj = new countNodes();
        System.out.println(obj.count(head));
        
    }
    public int count(ListNode head) {
        ListNode temp = head;
        int count = 0;

        while(temp != null){
            count++;
            temp = temp.next;
        }
        return count;

    }
}
    

