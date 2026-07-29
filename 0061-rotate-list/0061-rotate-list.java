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

        if(head==null){
            return null;
        }
        ListNode temp=head;
        int count=1;
        while(temp.next!=null){
            count++;
            temp=temp.next;
        }

        ListNode tail=temp;
        k=k%count;
        tail.next=head;

        ListNode newtail=head;
        for(int i=0;i<count-k-1;i++){
            newtail=newtail.next;
        }

        ListNode newhead=newtail.next;
        newtail.next=null;

    
        return newhead;
    }
}