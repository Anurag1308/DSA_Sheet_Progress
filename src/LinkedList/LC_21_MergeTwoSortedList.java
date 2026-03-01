package LinkedList;

public class LC_21_MergeTwoSortedList {
    class Solution {
        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            ListNode curr1 = list1;
            ListNode curr2 = list2;
            ListNode dummyHead = new ListNode(0);
            ListNode curr = dummyHead;

            while(curr1 != null && curr2 != null){
                if(curr1.val < curr2.val){
                    ListNode node = new ListNode(curr1.val);
                    curr1 = curr1.next;
                    curr.next = node;
                    curr = node;
                }
                else{
                    ListNode node = new ListNode(curr2.val);
                    curr2 = curr2.next;
                    curr.next = node;
                    curr = node;
                }

            }
            while(curr1 != null){
                ListNode node = new ListNode(curr1.val);
                curr1 = curr1.next;
                curr.next = node;
                curr = node;
            }
            while(curr2 != null){
                ListNode node = new ListNode(curr2.val);
                curr2 = curr2.next;
                curr.next = node;
                curr = node;
            }
            return dummyHead.next;
        }
    }
}
