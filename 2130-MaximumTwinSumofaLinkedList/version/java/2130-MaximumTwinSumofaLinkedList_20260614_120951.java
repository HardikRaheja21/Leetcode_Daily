// Last updated: 6/14/2026, 12:09:51 PM
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
12    public static ListNode reverse(ListNode head) {
13        if (head == null || head.next == null) { // Base case: check if head is null
14            return head;
15        }
16        ListNode newHead = reverse(head.next);
17        head.next.next = head; // Reversing the link
18        head.next = null; // Prevent cycle
19        return newHead;
20    }
21    public int pairSum(ListNode head) {
22        ListNode slow = head;
23        ListNode fast = head;
24        while(fast.next != null && fast.next.next != null){
25            slow = slow.next;
26            fast = fast.next.next;
27        }
28        ListNode temp = reverse(slow.next);
29        slow.next = temp;
30        ListNode p1 = head;
31        ListNode p2 = slow.next;
32        int maxSum = 0;
33        while(p2 != null){
34            int sum = p1.val + p2.val;
35            if(sum > maxSum){
36                maxSum = p1.val + p2.val;
37            }
38            p1 = p1.next;
39            p2 = p2.next;
40        }
41        return maxSum;
42    }
43}