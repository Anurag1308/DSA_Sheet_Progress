package LinkedList;

public class LC_19_RemoveNNodeFromEndOfLinkedList {
    class Solution {
        public ListNode removeNthFromEnd(ListNode head, int n) {
            ListNode dummyNode = new ListNode(0);
            dummyNode.next = head;

            ListNode slow = dummyNode;
            ListNode fast = dummyNode;

            for(int i = 0; i<n; i++){
                fast = fast.next;
            }

            while(fast.next != null){
                slow = slow.next;
                fast = fast.next;
            }
            slow.next = slow.next.next;
            return dummyNode.next;
        }
    }
}
