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
    public ListNode reverseList(ListNode head) {
        ListNode n1 = null;
        ListNode n2 = head;
        ListNode n3 = null;
        while(n2!=null)
        {
            n3 = n2.next;
            n2.next= n1;
            n1 =n2;
            n2 = n3;

        }
        return n1;
    }
}