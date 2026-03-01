package LinkedList;

public class LC_203_RemoveLinkedListElements {
    class Solution {
        public ListNode removeElements(ListNode head, int val) {
            ListNode dummy = new ListNode(0);
            dummy.next = head;
            ListNode prev = dummy;
            ListNode curr = head;
            while(curr != null){
                if(curr.val == val){
                    prev.next = curr.next;
                    curr = curr.next;
                    continue;
                }
                prev = curr;
                curr = curr.next;
            }
            return dummy.next;
        }
    }
}
