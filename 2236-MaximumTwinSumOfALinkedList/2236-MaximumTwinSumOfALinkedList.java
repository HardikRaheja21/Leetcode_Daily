// Last updated: 2/10/2026, 3:13:31 PM
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
    public static ListNode reverse(ListNode head) {
        if (head == null || head.next == null) { // Base case: check if head is null
            return head;
        }
        ListNode newHead = reverse(head.next);
        head.next.next = head; // Reversing the link
        head.next = null; // Prevent cycle
        return newHead;
    }
    public int pairSum(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode temp = reverse(slow.next);
        slow.next = temp;
        ListNode p1 = head;
        ListNode p2 = slow.next;
        int maxSum = 0;
        while(p2 != null){
            int sum = p1.val + p2.val;
            if(sum > maxSum){
                maxSum = p1.val + p2.val;
            }
            p1 = p1.next;
            p2 = p2.next;
        }
        return maxSum;
    }
}