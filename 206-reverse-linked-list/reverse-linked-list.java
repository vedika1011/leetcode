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
    public ListNode reverseList(ListNode head) {
        ListNode prev=null;
        ListNode curr=head;
        ListNode next;
        while(curr!=null){
            next=curr.next; //save rest of the nodes into next 
            curr.next=prev; //break chain i.e reverse
            prev=curr; //move prev forward
            curr=next; //move curr forward
        }
        return prev; //return prev as it points to the last node, head points to the original first node
    }
}