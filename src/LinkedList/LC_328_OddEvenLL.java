package LinkedList;

public class LC_328_OddEvenLL {
    class Solution {
        public ListNode oddEvenList(ListNode head) {
            ListNode evenHead = new ListNode(-1);
            ListNode oddHead = new ListNode(-2);
            ListNode even = evenHead;
            ListNode odd = oddHead;
            ListNode curr = head;
            int i = 0;
            while(curr != null){

                if(i%2 == 0) //odd
                {
                    odd.next = curr;
                    odd = odd.next;
                }
                else{
                    even.next = curr;
                    even = even.next;
                }
                curr = curr.next;
                i++;
            }
            even.next = null;
            odd.next = evenHead.next;
            return oddHead.next;
        }
    }
}
