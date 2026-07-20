// Last updated: 7/20/2026, 9:32:52 AM
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
12    public ListNode reverse(ListNode head){
13        if(head == null || head.next == null) return head;
14        ListNode newHead = reverse(head.next);
15        head.next.next = head;
16        head.next = null;
17        return newHead;
18
19    }
20    public boolean isPalindrome(ListNode head) {
21        ListNode slow  = head;
22        ListNode fast = head;
23        while(fast.next != null && fast.next.next != null){
24            slow = slow.next;
25            fast = fast.next.next;
26        }
27        ListNode temp = reverse(slow.next);
28        slow.next = temp;
29        ListNode p1 = head;
30        ListNode p2 = slow.next;
31        while(p2 != null){
32            if(p1.val != p2.val) return false;
33            p1 = p1.next;
34            p2 = p2.next;
35        }
36        return true;
37    }
38}