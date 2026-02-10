// Last updated: 2/10/2026, 3:19:26 PM
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
    public ListNode partition(ListNode head, int x) {
        ListNode head1 = new ListNode(100);
        ListNode temp1 = head1;
        ListNode head2 = new ListNode(101);
        ListNode temp2 = head2;
        ListNode t = head;
        while(t != null){
            if(t.val < x){
                temp1.next = t;
                temp1 = t;
                t = t.next;
            } else {
                temp2.next = t;
                temp2 = t;
                t = t.next;
            }
        }
        temp2.next = null;
        temp1.next = head2.next;
        return head1.next;
    }
}