// Last updated: 7/13/2026, 5:59:00 AM
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
12    public ListNode reverseList(ListNode head) {
13        ListNode curr = head;
14        ListNode prev = null;
15        while(curr != null){
16            ListNode temp = curr.next;
17            curr.next = prev;
18            prev = curr;
19            curr = temp;
20        }
21        return prev;
22    }
23}