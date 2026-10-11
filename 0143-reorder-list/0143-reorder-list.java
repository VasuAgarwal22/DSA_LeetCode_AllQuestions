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
        if (head == null || head.next == null)
            return;
        ListNode mid = middle(head);
        ListNode second = mid.next;
        mid.next = null;
        ListNode rev = reverse(second);
        ListNode hf = head;
        ListNode hs = rev;
        while (hf != null && hs != null) {
            ListNode first = hf.next;
            ListNode sec = hs.next;
            hf.next = hs;
            hs.next = first;
            hf = first;
            hs = sec;
        }

    }

    private ListNode middle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    private ListNode reverse(ListNode head) {
        if (head == null)
            return head;
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}