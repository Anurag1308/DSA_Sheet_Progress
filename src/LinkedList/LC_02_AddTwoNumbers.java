package LinkedList;

public class LC_02_AddTwoNumbers {

    class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode curr1 = l1;
            ListNode curr2 = l2;
            ListNode head = new ListNode(0);
            ListNode curr = head;
            int carry = 0;
            while(curr1 != null && curr2 != null){
                int sum = curr1.val + curr2.val + carry;
                ListNode node = new ListNode(sum%10);
                carry = sum/10;

                curr1 = curr1.next;
                curr2 = curr2.next;
                curr.next = node;
                curr = node;
            }
            while(curr1 != null){
                int sum = curr1.val + carry;
                ListNode node = new ListNode(sum%10);
                carry = sum / 10;
                curr1 = curr1.next;
                curr.next = node;
                curr = node;
            }
            while(curr2 != null){

                int sum = curr2.val + carry;
                ListNode node = new ListNode(sum%10);
                carry = sum / 10;
                curr2 = curr2.next;
                curr.next = node;
                curr = node;
            }
            if(carry != 0){
                ListNode node = new ListNode(carry);
                curr.next = node;
                curr = node;
            }
            return head.next;
        }
    }
}
