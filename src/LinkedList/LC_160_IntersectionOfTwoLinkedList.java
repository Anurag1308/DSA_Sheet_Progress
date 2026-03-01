package LinkedList;

public class LC_160_IntersectionOfTwoLinkedList {
    public class Solution {
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            //find the size of both linkedlists
            int lA = sizeOfLL(headA);
            int lB = sizeOfLL(headB);
            ListNode tempA = headA;
            ListNode tempB = headB;
            if(lA>lB){
                int index = lA - lB;
                for(int i = 0; i<index; i++){
                    tempA = tempA.next;
                }
            }
            else{
                int index = lB - lA;
                for(int i = 0; i<index; i++){
                    tempB = tempB.next;
                }
            }
            while(tempA != null && tempA != tempB){
                tempA = tempA.next;
                tempB = tempB.next;
            }
            return tempA;
        }
        public int sizeOfLL(ListNode head){
            int length = 0;
            ListNode temp = head;
            while(temp != null){
                length++;
                temp = temp.next;
            }
            return length;
        }
    }
}
