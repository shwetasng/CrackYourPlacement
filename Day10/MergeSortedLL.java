package Day10;

import java.lang.classfile.components.ClassPrinter.ListNode;

public class MergeSortedLL {
     public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy= new ListNode(0);
        ListNode temp= dummy;

        while(list1!=null && list2!=null){
            if (list1.val<=list2.val){
                temp.next=list1; // this will be list1 and not list1.val because temp.next is basically pointing to a ListNode and not to an integer
                list1=list1.next;
            }
            else{
                temp.next=list2;
                list2=list2.next;
            }
            temp=temp.next;
        }

        if(list1==null){
            temp.next=list2;
        }
        else{
            temp.next=list1;
        }
        return dummy.next;
    }
    
}
