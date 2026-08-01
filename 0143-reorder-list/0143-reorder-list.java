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
    public void reorderList(ListNode head) {

        ListNode middle=findMiddle(head);
        ListNode secondlist= reverse(middle.next);
        middle.next=null;

        ListNode first=head;
        ListNode second=secondlist;
        while(first!=null && second!=null){
            
            ListNode next1 = first.next;
            ListNode next2 = second.next;

            first.next = second;
            second.next = next1;

            first = next1;
            second = next2;
        }




               
    }


    public ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        return prev;

    } 





    //middle
  
  
    public ListNode findMiddle(ListNode head){
        if(head==null){
            return null;
        }

        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;  
        }

        return slow;
    }


}