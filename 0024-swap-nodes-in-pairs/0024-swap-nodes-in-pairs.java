class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;
        
        ListNode newHead = head.next;
        ListNode prev = null;
        ListNode temp = head;
        
        while (temp != null && temp.next != null) {
            ListNode nextPair = temp.next.next;
            ListNode second = temp.next;
            
            second.next = temp;
            temp.next = nextPair;
            
            if (prev != null) {
                prev.next = second;
            }
            
            prev = temp;
            temp = nextPair;
        }
        
        return newHead;
    }
}
