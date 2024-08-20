package Day11;

import java.lang.classfile.components.ClassPrinter.ListNode;

public class ReverseLL {

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode currnext;
        
        while (curr != null) {
            currnext = curr.next;  // Update currnext before moving curr
            curr.next = prev;       // Reverse the current node's pointer
            prev = curr;            // Move prev to the current node
            curr = currnext;        // Move curr to the next node (which was stored in currnext)
        }
        
        return prev;  // prev is the new head of the reversed list
        }
}

