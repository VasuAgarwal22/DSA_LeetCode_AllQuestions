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
    public ListNode sortList(ListNode head) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a,b)->Integer.compare(a.val,b.val));
        ListNode temp = head;
        while(temp!=null){
            pq.offer(temp);
            temp = temp.next;
        }
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;
        while(!pq.isEmpty()){
            ListNode node = pq.poll();
            current.next = node;
            current = current.next;
        }
        current.next = null;
        return dummy.next;
    }
}