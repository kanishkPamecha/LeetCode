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
    public ListNode mergeKLists(ListNode[] lists) {

        PriorityQueue<ListNode> ans = new PriorityQueue<>((a,b)-> a.val-b.val);
        for(ListNode a : lists)
        { if(a!=null)
            ans.add(a);
        }
ListNode head = new ListNode(0);
ListNode temp =head;
    while(!ans.isEmpty()){  ListNode a  =    ans.poll();
     temp.next =a;
       if(a.next!=null) ans.add(a.next);
       temp= temp.next;
    }
        return head.next;
    }
}