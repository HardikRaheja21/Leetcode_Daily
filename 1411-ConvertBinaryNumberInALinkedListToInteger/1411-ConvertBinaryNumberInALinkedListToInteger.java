// Last updated: 2/10/2026, 3:14:59 PM
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
    public int getDecimalValue(ListNode head) {
        int result = 0;
        ListNode current = head;
        
        while (current != null) {
            result = (result << 1) | current.val;  // shift left + add current bit
            current = current.next;
        }
        
        return result;
    }
}