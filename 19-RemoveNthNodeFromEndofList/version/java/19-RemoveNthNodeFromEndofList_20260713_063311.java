// Last updated: 7/13/2026, 6:33:11 AM
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode removeNthFromEnd(ListNode head, int n) {
13        ListNode slow = head, fast = head;
14        int idx = 1;
15        while(idx <= n){
16            fast = fast.next;
17            idx++;
18        }
19        if(fast == null) return head.next;
20        while(fast.next != null){
21            slow = slow.next;
22            fast = fast.next;
23        }
24        if(slow.next != null) slow.next = slow.next.next;
25        return head;
26    }
27}