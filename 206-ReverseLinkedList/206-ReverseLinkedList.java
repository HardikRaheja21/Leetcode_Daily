// Last updated: 2/10/2026, 3:18:15 PM
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
    public ListNode reverseList(ListNode head) {

        // //Iteratively using three pointers
        // ListNode curr = head;
        // ListNode prev = null;
        // ListNode after = null;
        // while(curr != null){
        //     after = curr.next;
        //     curr.next = prev;
        //     prev = curr;
        //     curr = after;
        // }
        // return prev;


        //Recursively
        return reverse(head);
    }
    public static ListNode reverse(ListNode head) {
        if (head == null || head.next == null) { // Base case: check if head is null
        return head;
    }
    ListNode newHead = reverse(head.next);
    head.next.next = head; // Reversing the link
    head.next = null; // Prevent cycle
    return newHead;
    }

}