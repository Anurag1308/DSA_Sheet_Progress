package LinkedList;

public class LC_61_RotateList {
    class Solution {
        public ListNode rotateRight(ListNode head, int k) {
            if(head == null || head.next == null || k==0){
                return head;
            }
            ListNode tail = head;
            int size = 1;
            while(tail.next != null){
                size++;
                tail = tail.next;
            }
            k = k % size;
            if(k == 0){
                return head;
            }
            ListNode curr = head;
            for(int i = 0; i < size - k - 1; i++){
                curr = curr.next;
            }
            ListNode temp = curr.next;
            curr.next = null;
            tail.next = head;
            return temp;
        }
    }
}
