class Solution {
    public ListNode removeNodes(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        ListNode nextNode = null;
        while (current != null) {
            nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        head = prev;

       
        ListNode temp = head;
        while (temp != null && temp.next != null) {
            if (temp.next.val < temp.val) {
                temp.next = temp.next.next; 
            } else {
                temp = temp.next;
            }
        }

        
        ListNode newHead = null;
        ListNode current2 = head;
        while (current2 != null) {
            nextNode = current2.next;
            current2.next = newHead;
            newHead = current2;
            current2 = nextNode;
        }
        return newHead;
    }
}
