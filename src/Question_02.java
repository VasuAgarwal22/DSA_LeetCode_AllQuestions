import java.util.List;
public class Question_02 {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);
        ListNode ans = addTwoNumber(l1,l2);
        while(ans!= null){
            System.out.print(ans.val + " ");
            ans = ans.next;
        }
    }
    public static ListNode addTwoNumber(ListNode l1 , ListNode l2){
        int carry = 0;
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;
        while(l1!= null || l2!=null || carry!=0) {
            int sum = carry;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
        }
        return dummy.next;
    }
}
