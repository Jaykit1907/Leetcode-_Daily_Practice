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
    public ListNode oddEvenList(ListNode head) {
        ListNode odd=new ListNode(10);
        ListNode temp1=odd;
        ListNode even=new ListNode(10);
        ListNode temp2=even;
        ListNode temp=head;
        while(temp!=null){
                temp1.next=temp;
                temp1=temp1.next;

                temp=temp.next;
                if(temp!=null){
temp2.next=temp;
                temp2=temp2.next;
                temp=temp.next;
                }
                
        }

        temp1.next=even.next;
    temp2.next=null;
            return odd.next;
    }
}