package Day10;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class IntersectionOf2LL {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // Compute length of LL1
        int L1=0;
        ListNode t1=headA;

        while(t1!=null){
            L1++;
            t1=t1.next;
        }

        // Compute length of LL2
        int L2=0;
        ListNode t2=headB;

        while(t2!=null){
            L2++;
            t2=t2.next;
        }

        // Now we want the longer LL to travel the difference
        if(L1<L2){
            return collisionPoint(headA, headB, L2-L1);
        }
        else{
            return collisionPoint(headB, headA, L1-L2);
        }

    }

    public ListNode collisionPoint(ListNode t1, ListNode t2, int d){// here t2 is of greater length
        while(d!=0){
            d--;
            t2=t2.next;
        }// now t2 and t1 are aligned

        // lets now start comparing t1 and t2
        while(t1!=t2){
            t1=t1.next;
            t2=t2.next;
        }

        return t1;// t2 can also be returned
    }
}
