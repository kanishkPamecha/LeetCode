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
    public ListNode Reverse(ListNode head)
    {
        ListNode n1 = null;
        ListNode n2 = head;
        ListNode n3 = null;
        while(n2!=null)
        {
            n3 = n2.next;
            n2.next =n1;
            n1= n2;
            n2 = n3;
        }
        return n1;
    }
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        ListNode slow1= null;
   while(fast.next!=null && fast.next.next!=null)
   {
     slow =slow.next;
     fast = fast.next.next;
   }
   slow1 = slow.next;
   slow.next = null;
  ListNode temp2 =  Reverse(slow1);
  ListNode  temp1 = head;

  
        while(temp2 != null){
            ListNode nextNode = temp1.next ;
            temp1.next = temp2;
            temp1 = temp2;
            temp2 = nextNode;
        }
   
    
    }
}