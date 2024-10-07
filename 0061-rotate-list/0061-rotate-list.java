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
    public ListNode rotateRight(ListNode head, int k) {
        
        if(head==null || head.next== null || k==0) return head;

        ListNode temp = head;
        int count =1;
        temp = head;
        while(temp.next!=null)
        {
            count++;
            temp = temp.next;

        }
        temp.next = head;
        k%=count;

        int length  = count -k;

        for(int i = 0 ;i< length ;i++)
        {
            temp = temp.next;
        } 
        head = temp.next;
        temp.next = null;

         return head;
    }
}