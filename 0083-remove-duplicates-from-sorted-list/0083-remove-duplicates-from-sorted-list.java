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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode head1=new ListNode(10);
        ListNode temp1=head1;
        ListNode temp=head;
        if(head==null ||  head.next==null){
            return head;
        }
        temp1.next=temp;
        temp1=temp1.next;
        temp=temp.next;
        while(temp!=null){
            if(temp1.val!=temp.val){
                temp1.next=temp;
                temp1=temp1.next;
                
            }
            temp=temp.next;
        }
        temp1.next=null;
        return head1.next;
    }
}