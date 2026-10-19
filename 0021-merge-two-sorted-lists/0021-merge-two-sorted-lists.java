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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp1=list1;
        ListNode temp2=list2;
        ListNode t1=new ListNode(10);
        
        ListNode temp_t1=t1;

        while(temp1!=null && temp2!=null){

            if(temp1.val<temp2.val){
                    temp_t1.next=temp1;
                    temp1=temp1.next;
                    temp_t1=temp_t1.next;
            }
            else{
                temp_t1.next=temp2;
                temp2=temp2.next;
                temp_t1=temp_t1.next;
            }
        }

        if(temp1!=null){
            temp_t1.next=temp1;
            
        }
        if(temp2!=null){
            temp_t1.next=temp2;
        }

        return t1.next;
    }
}