// Last updated: 2/10/2026, 3:19:49 PM
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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null) return head;

        ListNode temp = head;
        int length = 0;
        while(temp != null){
            temp = temp.next;
            length++;
        }
        int rotation = k % length;

        for(int i = 0; i < rotation; i++){
            ListNode last = head, prev = null;
            while(last.next != null){
                prev = last;
                last = last.next;
            }
            last.next = head;
            prev.next = null;
            head = last;
        }
        return head;
    }
}