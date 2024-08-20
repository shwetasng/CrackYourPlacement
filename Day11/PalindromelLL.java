package Day11;

import java.lang.classfile.components.ClassPrinter.ListNode;
import java.util.Stack;

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

 // APPROACH-1

public class PalindromelLL {
 
    public boolean isPalindrome(ListNode head) {
     Stack<Integer> stack = new Stack<>();
        ListNode current = head;

        // Push all elements of the linked list onto the stack
        while (current != null) {
            stack.push(current.val);
            current = current.next;
        }

        // Reset pointer to the head of the linked list
        current = head;

        // Compare elements in the stack with the linked list
        while (current != null) {
            if (current.val != stack.pop()) {
                return false; // Mismatch found, not a palindrome
            }
            current = current.next;
        }

        return true; // If no mismatches, it's a palindrome
    }
    
}

// APPROACH-2


class Solution {
    public boolean isPalindrome(ListNode head) {
     if (head == null || head.next == null) {
            return true; // A single node or empty list is a palindrome
        }

        // Step 1: Use the slow and fast pointers to find the middle of the list
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Reverse the second half of the list
        ListNode secondHalf = reverseList(slow);

        // Step 3: Compare the first half and the reversed second half
        ListNode firstHalf = head;
        ListNode reversed = secondHalf;
        while (reversed != null) {
            if (firstHalf.val != reversed.val) {
                return false; // Mismatch found, not a palindrome
            }
            firstHalf = firstHalf.next;
            reversed = reversed.next;
        }

        // Step 4: (Optional) Restore the original list by reversing the second half back
        reverseList(secondHalf);

        return true; // If no mismatches, it's a palindrome
    }

    // Helper function to reverse a linked list
    private static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        while (current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    
}

