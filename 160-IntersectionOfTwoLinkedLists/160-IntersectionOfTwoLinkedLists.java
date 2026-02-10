// Last updated: 2/10/2026, 3:18:37 PM
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp1 = headA;
        ListNode temp2 = headB;
        while(temp1 != temp2){
            if(temp1 == null){
                temp1 = headB;
            } else {
                temp1 = temp1.next;
            }
            if(temp2 == null){
                temp2 = headA;
            } else {
                temp2 = temp2.next;
            }
        }
        return temp2;
    }
}