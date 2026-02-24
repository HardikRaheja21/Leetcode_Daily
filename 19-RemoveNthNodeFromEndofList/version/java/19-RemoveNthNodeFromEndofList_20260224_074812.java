// Last updated: 2/24/2026, 7:48:12 AM
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
13        ListNode slow = head;
14        ListNode fast =  head;
15        int idx = 1;
16        while(idx <= n){
17            fast = fast.next;
18            idx++;
19        }
20        if(fast == null) return head.next;
21        while(fast.next != null){
22            slow = slow.next;
23            fast = fast.next;
24        }
25        if(slow.next != null) slow.next = slow.next.next;
26        return head;
27    }
28}