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
    public ListNode removeZeroSumSublists(ListNode head) {
        ListNode Temp = head;
      Map<Integer,ListNode > mp = new java.util.HashMap<>();
      int Sum =0;
       ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        mp.put(0, dummy); 
            
        while (Temp != null) {
            Sum += Temp.val;
            if (mp.containsKey(Sum)) {
                ListNode start = mp.get(Sum);
                ListNode temp = start.next;
                int tempSum = Sum + temp.val;
                while (temp != Temp) {
                    mp.remove(tempSum);
                    temp = temp.next;
                    tempSum += temp.val;
                }
                start.next = Temp.next;
            } else {
                mp.put(Sum, Temp);
            }
            Temp = Temp.next;
        }
        
        return dummy.next;
    }
}