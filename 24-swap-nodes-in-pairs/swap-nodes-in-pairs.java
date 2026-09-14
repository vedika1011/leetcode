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
    public ListNode swapPairs(ListNode head) {
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode prev=dummy;
        ListNode curr=prev.next;
        while(curr!=null && curr.next!=null){
            ListNode first=curr;
            ListNode second=curr.next; //prev->first->second->next pair
            prev.next=second; //swapping first and second
            first.next=second.next;
            second.next=first;
            prev=first; //move prev and curr fwd
            curr=first.next;
        }
        return dummy.next;
    }

}