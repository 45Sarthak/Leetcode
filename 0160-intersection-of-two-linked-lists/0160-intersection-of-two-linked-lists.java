/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tempA=headA;
        ListNode tempB=headB;

        int lenA=getListNodeLen(headA);
        int lenB=getListNodeLen(headB);

        if(headA == null || headB == null){
                return null;
        }

        while(lenA > lenB){
            
            lenA--;
            tempA=tempA.next;
        }

        
        while(lenB > lenA){
            
            lenB--;
            tempB=tempB.next;
        }


        
        while(tempA!=tempB){
            
            tempA=tempA.next;
            tempB=tempB.next;
        }

        return tempA;

    }



     public int getListNodeLen(ListNode head){
            ListNode temp=head;
            int count=0;
            while(temp!=null){
                count++;
                temp=temp.next;
            }

            return count;
        }


          

}