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
    public void reorderList(ListNode head) {
      ListNode slow=head;
      ListNode fast=head;
      ListNode next;
      while(fast!=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
      } //middle element at slow
      ListNode list2; //new list 
       
            list2=slow.next;

        ListNode prev=null;
        ListNode curr=list2;

        while(curr!=null){ //reverse list2
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }  
        slow.next=null; //separate two lists 1,2,3 and 4,5
        ListNode p1=head;
        ListNode p2=prev;
        while(p2!=null){
        ListNode next1=p1.next;
        ListNode next2=p2.next; //save original connections
        p1.next=p2;
        p2.next=next1; //connect
        p1=next1;
        p2=next2; //move dorward p1 and p2
        }


    }
}