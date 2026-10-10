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
    public ListNode removeNodes(ListNode head) {
        ArrayList<Integer> ans = new ArrayList<>();
        ArrayList<Integer> ans1 = new ArrayList<>();
        ListNode temp = head;
        while(temp != null){
            ans.add(temp.val);
            temp = temp.next;
        }
        int val = ans.get(ans.size()-1);
        ans1.add(val);
        for(int i = ans.size()-2;i>=0;i--){
            if(ans.get(i)>=val){
                ans1.add(ans.get(i));
                val = ans.get(i);
            }
        }
       Collections.reverse(ans1);
       ListNode dummy = new ListNode(-1);
       ListNode curr = dummy;
       for(int i = 0;i<ans1.size();i++){
        curr.next = new ListNode(ans1.get(i));
        curr = curr.next;
       }
       return dummy.next;
    }
}