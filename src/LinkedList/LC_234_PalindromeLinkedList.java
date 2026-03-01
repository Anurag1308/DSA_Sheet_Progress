package LinkedList;

public class LC_234_PalindromeLinkedList {
    class Solution {
        public boolean isPalindrome(ListNode head) {
            //for 0 and 1 node
            if(head == null || head.next == null)
                return true;

            //find mid
            ListNode slow = head;
            ListNode fast = head;
            while(fast != null && fast.next != null){
                slow = slow.next;
                fast = fast.next.next;
            }

            //reverse froom middle
            ListNode curr = slow;
            ListNode prev = null;
            while(curr != null){
                ListNode nextNode = curr.next;
                curr.next = prev;
                prev = curr;
                curr = nextNode;
            }

            //compare
            ListNode first = head;
            ListNode second = prev;
            while(second != null){
                if(first.val != second.val)
                    return false;
                first = first.next;
                second = second.next;
            }
            return true;
        }
    }
}
