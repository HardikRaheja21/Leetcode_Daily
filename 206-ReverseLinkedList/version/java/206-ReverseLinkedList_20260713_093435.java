// Last updated: 7/13/2026, 9:34:35 AM
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
12    public ListNode reverseBetween(ListNode head, int left, int right) {
13        if(left == right || head == null || head.next == null) return head;
14        ListNode dummy = new ListNode(0);
15        dummy.next = head;
16        ListNode prev = dummy;
17        for(int i = 0; i < left - 1; i++) prev = prev.next;
18        ListNode curr = prev.next;
19        for(int i = 0; i < right - left; i++){
20            ListNode temp = curr.next;
21
22            curr.next = temp.next;
23
24            temp.next = prev.next;
25
26            prev.next = temp;    
27        }
28        return dummy.next;
29    }
30}