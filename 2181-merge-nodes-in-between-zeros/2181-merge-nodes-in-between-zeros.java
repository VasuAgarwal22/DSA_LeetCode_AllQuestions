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
    public ListNode mergeNodes(ListNode head) {
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;
        while (head != null) {
            if (head.val == 0) {
                head = head.next;
                continue;
            }
            int sum = 0;
            while(head != null && head.val != 0){
                sum += head.val;
                head = head.next;
            } 
            curr.next = new ListNode(sum);
            curr = curr.next;
        }
        return dummy.next;
    }
}
