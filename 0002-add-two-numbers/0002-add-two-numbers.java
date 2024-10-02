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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        
        ListNode t1 = l1;
        ListNode t2 = l2;
        ListNode ans = new ListNode(3);
   ListNode anstemp = ans;
        int rem=0;
        while(t1!=null && t2!=null)
        {
             int d = t1.val+ t2.val+rem;
             rem = d/10;
             ListNode a = new ListNode(d%10);
             anstemp.next= a;
             t1 =t1.next;
             t2 =t2.next;
             anstemp = anstemp.next;
        }
         while(t1!=null)
        {
             int d = t1.val+rem;
             rem = d/10;
             ListNode a = new ListNode(d%10);
          anstemp.next= a;
              t1 =t1.next;
               anstemp = anstemp.next;
        }
         while( t2!=null)
        {
             int d = t2.val+rem;
             rem = d/10;
             ListNode a = new ListNode(d%10);
            anstemp.next= a;
                anstemp = anstemp.next;
             t2 =t2.next;
        }
        if(rem!=0)
        {
             ListNode a = new ListNode(rem);
          anstemp.next= a;
            anstemp = anstemp.next;
        }
        return ans.next;
    }
}