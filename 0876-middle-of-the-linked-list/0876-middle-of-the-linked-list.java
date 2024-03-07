/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
          
          //middle of a LinkedList 

         ListNode fast = head;
         ListNode slow = head;
    
        while(fast.next!=null)
        {
          if(fast.next.next!=null)  fast=fast.next.next;
         else{fast=fast.next;}
            slow=slow.next;
        }

return slow;
    }
}