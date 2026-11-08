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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode head1=new ListNode(10);
        ListNode temp1=head1;
        head1.next=head;
        for(int i=1;i<left;i++){
            temp1=temp1.next;
        }
        ListNode curr=temp1.next;
        ListNode prev=null;
        ListNode agla=null;
        for(int i=left;i<=right;i++){
                agla=curr.next;
                curr.next=prev;
                prev=curr;
                curr=agla;
        }
        ListNode start=temp1.next;
        temp1.next=prev;
        start.next=curr;
        return head1.next;
        
    }
}