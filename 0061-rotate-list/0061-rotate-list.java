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
    public ListNode rotateRight(ListNode head, int k) {
        ListNode temp=head;
        ListNode head1=new ListNode(10);
        ListNode temp1=head1;
        int size=0;
        if(head==null){
            return head;
        }
        while(temp!=null){
            temp=temp.next;
            size++;
        }
        if(k!=0){
         k=k%size;
        }
        else{
            return head;
        }
        temp=head;
        for(int i=1;i<size-k;i++){
            temp=temp.next;
        }

        temp1.next=temp.next;
        temp.next=null;
      
        while(temp1.next!=null){
            temp1=temp1.next;
        }
        temp1.next=head;

return head1.next;

       
    

    }
}