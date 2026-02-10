// Last updated: 2/10/2026, 3:16:01 PM
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
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){         //here order matters, if fast != null && fast.next != null got swapped as fast.next != null && fast != null then it will not work as if first condition of while is false then it not check the other one...
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}