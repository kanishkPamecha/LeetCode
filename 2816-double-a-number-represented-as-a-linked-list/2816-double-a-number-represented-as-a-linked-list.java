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
    public ListNode doubleIt(ListNode head) {
        ListNode n1 = null;
        ListNode n2 = head;
        ListNode n3 =null;
        while(n2!=null)
        {
            n3= n2.next;
            n2.next=n1;
            n1 = n2;
            n2 =n3 ;
        }
        head = n1 ;
         int carry =0;
         int value=0;
         while(n1!=null)
         {
            value = 2*n1.val+carry;
            carry=value/10;
            value%=10;
            n1.val=value;
            n2=n1;
            n1 = n1.next;
         }
         ListNode a = new ListNode(0);
         if(carry !=0)
         {
            n2.next =a;
            a.val = carry;
         }
         n1 = null;
         n2 = head;
         n3 =null;
        while(n2!=null)
        {
            n3= n2.next;
            n2.next=n1;
            n1 = n2;
            n2 =n3 ;
        }
        return n1;
    }
}