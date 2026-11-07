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
        ListNode head1=new ListNode(10);
        ListNode temp1=head1;
        ListNode temp=head;
        ListNode prev=head;
        if(head==null || head.next==null){
            return head;
        }
        while(prev!=null && prev.next!=null){
           ListNode agla=prev.next.next;
            temp1.next=prev.next;
            temp1=temp1.next;
            temp1.next=prev;
            temp1=temp1.next;

            prev=prev.next.next;
           

           prev=agla;
           
        }
        temp1.next=prev;
        return head1.next;
        
    }
}