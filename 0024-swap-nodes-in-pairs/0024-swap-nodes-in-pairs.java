class Solution {
    public ListNode swapPairs(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

        ListNode newHead = head.next;

        ListNode prev = null;
        ListNode first = head;
        ListNode second = head.next;

        while (first != null && second != null) {

            first.next = second.next;
            second.next = first;

            if (prev != null) {
                prev.next = second;
            }

            prev = first;
            first = first.next;

            if (first != null) {
                second = first.next;
            } else {
                second = null;
            }
        }

        return newHead;
    }
}