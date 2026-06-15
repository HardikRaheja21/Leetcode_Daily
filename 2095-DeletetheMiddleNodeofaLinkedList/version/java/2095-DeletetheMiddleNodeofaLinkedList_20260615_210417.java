// Last updated: 6/15/2026, 9:04:17 PM
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
12    public ListNode deleteMiddle(ListNode head) {
13        if(head.next == null){         //this means that size of list is 1
14            return null;
15        }
16        ListNode slow = head;
17        ListNode fast = head;
18        while(fast.next.next != null && fast.next.next.next != null){
19            slow = slow.next;
20            fast = fast.next.next;
21        }
22        slow.next = slow.next.next;
23        return head;
24    }
25}