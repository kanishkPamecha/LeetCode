class Solution {
    
    public ListNode rev(ListNode head) {
        ListNode prev = null; 
        ListNode current = head;
        ListNode next = null;
        
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        
        return prev;
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k == 1) return head;  

        ListNode dummy = new ListNode(0);  
        dummy.next = head;
        ListNode start = null; 
        ListNode end = dummy;  

        while (true) {
            
            ListNode temp2 = end;
            for (int i = 0; i < k && temp2 != null; i++) {
                temp2 = temp2.next;
            }
            if (temp2 == null) break; 

            ListNode temp1 = end.next;
            ListNode temp2next = temp2.next;
            temp2.next = null;  

            
            end.next = rev(temp1);
            temp1.next = temp2next;
            end = temp1;
        }

        return dummy.next;  
    }
}
