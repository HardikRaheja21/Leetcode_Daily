// Last updated: 7/21/2026, 1:40:29 PM
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
12    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
13        ListNode dummy = new ListNode(0);
14        ListNode t1 = l1;
15        ListNode t2 = l2;
16        ListNode curr = dummy;
17        int carry = 0;
18        while(t1 != null || t2 != null){
19            int sum = carry;
20            if(t1 != null) sum+= t1.val;
21            if(t2 != null) sum += t2.val;
22            ListNode newt = new ListNode(sum % 10);
23            carry = sum / 10;
24            curr.next = newt;
25            curr = curr.next;
26            if(t1 != null) t1 = t1.next;
27            if(t2 != null) t2 = t2.next;
28        }
29        if(carry > 0){
30            ListNode newr = new ListNode(carry);
31            curr.next = newr;
32            curr = curr.next;
33        }
34        return dummy.next;
35    }
36}