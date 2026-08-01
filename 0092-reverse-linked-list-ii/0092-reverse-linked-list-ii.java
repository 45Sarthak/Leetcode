/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) {
 *         this.val = val;
 *         this.next = next;
 *     }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {

        if (head == null || left == right) {
            return head;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        // beforeLeft ko left-1 position tak le jao
        ListNode beforeLeft = dummy;
        for (int i = 1; i < left; i++) {
            beforeLeft = beforeLeft.next;
        }

        // Reverse start
        ListNode leftNode = beforeLeft.next;
        ListNode prev = null;
        ListNode curr = leftNode;

        // LC206 logic
        for (int i = 0; i < right - left + 1; i++) {

            ListNode next = curr.next;

            curr.next = prev;

            prev = curr;

            curr = next;
        }

        // Reconnect
        beforeLeft.next = prev;
        leftNode.next = curr;

        return dummy.next;
    }
}