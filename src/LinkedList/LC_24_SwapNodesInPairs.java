package LinkedList;

public class LC_24_SwapNodesInPairs {
    class Solution {
        public ListNode swapPairs(ListNode head) {
            if(head == null || head.next == null){
                return head;
            }
            ListNode dummyHead = new ListNode(0);
            dummyHead.next = head;
            ListNode prev = dummyHead;
            ListNode first = head;
            while(first != null && first.next != null){
                ListNode second = first.next;
                ListNode nextPair = second.next;
                prev.next = second;
                second.next = first;
                first.next = nextPair;

                prev = first;
                first = first.next;
            }

            return dummyHead.next;
        }
    }
}
