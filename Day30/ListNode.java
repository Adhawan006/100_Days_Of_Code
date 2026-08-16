package hundred_days_of_code.Day30;


  public class ListNode {
      int val;
      ListNode next;
     ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

  //7 2 4 3
  //  5 6 4
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode rev1 = reverseLL(l1);
        ListNode rev2 = reverseLL(l2);

        ListNode dummyHead = new ListNode(0);
        ListNode curr = dummyHead;
        int carry = 0;
        
        while (rev1 != null || rev2 != null || carry != 0) {
            int val1 = (rev1 != null) ? rev1.val : 0;
            int val2 = (rev2 != null) ? rev2.val : 0;

            int sum = val1 + val2 + carry;
            carry = sum / 10;
            int digit = sum % 10;

            curr.next = new ListNode(digit);
            curr = curr.next;

            if (rev1 != null) rev1 = rev1.next;
            if (rev2 != null) rev2 = rev2.next;
        }
        
        return reverseLL(dummyHead.next);

    }

public ListNode reverseLL(ListNode head){
   ListNode prev = null;
   ListNode curr = head;

   while(curr != null){
    ListNode nextTemp = curr.next;
    curr.next = prev;
    prev = curr;
    curr = nextTemp;
   }
   return prev;
}
}