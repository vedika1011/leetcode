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
    public boolean isPalindrome(ListNode head) {
        ListNode next;
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        } //middle element present at slow
        ListNode list2; //new list 
        if(fast==null){
            list2=slow; //even length list (list is already traverse)
        }
        else{
            list2=slow.next; //(odd length list)
        }

        ListNode prev=null;
        ListNode curr=list2;

        while(curr!=null){ //reverse list2
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        //compare original and reversed list
        ListNode p1=head;
        ListNode p2=prev; //starting of list2
        while(p2!=null){ 
            if(p1.val!=p2.val){
                return false; //compare every node of list and list2
            }
            p1=p1.next; //move both pointers forward
            p2=p2.next;
        }
        return true;

    }
}