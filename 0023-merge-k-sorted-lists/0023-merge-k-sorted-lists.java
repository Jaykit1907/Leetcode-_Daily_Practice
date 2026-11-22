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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq=new PriorityQueue<>((a,b)->{
            return Integer.compare(a.val,b.val);
        });
        for(ListNode node:lists){
                ListNode head=node;

                while(head!=null){
                    pq.add(head);
                    head=head.next;
                }

        }
        ListNode head1=new ListNode(10);
        ListNode temp1=head1;
        while(pq.size()>0){
            temp1.next=pq.poll();
            temp1=temp1.next;
        }
        temp1.next=null;
        return head1.next;
    }
}