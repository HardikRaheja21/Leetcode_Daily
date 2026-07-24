// Last updated: 7/24/2026, 4:26:31 PM
1/**
2 * Definition for singly-linked list.
3 * class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode(int x) {
7 *         val = x;
8 *         next = null;
9 *     }
10 * }
11 */
12public class Solution {
13    public boolean hasCycle(ListNode head) {
14        if(head == null || head.next == null) return false;
15        ListNode slow = head;
16        ListNode fast = head;
17        while(fast != null){
18            if(slow == null) return false;
19            slow = slow.next;
20            if(fast.next == null) return false;
21            fast = fast.next.next;
22            if(slow == fast) return true;
23        }
24        return false;
25    }
26}