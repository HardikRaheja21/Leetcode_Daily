// Last updated: 7/13/2026, 2:51:37 PM
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
12    public ListNode sortList(ListNode head) {
13        if(head == null || head.next == null) return head;
14        ListNode prev = null, slow = head, fast = head;
15        while(fast != null && fast.next != null){
16            prev = slow;
17            slow = slow.next;
18            fast = fast.next.next;
19        }
20        prev.next = null;
21        ListNode l1 = sortList(head);
22        ListNode l2 = sortList(slow);
23        return merge(l1, l2);
24    }
25    public ListNode merge(ListNode l1, ListNode l2){
26        ListNode l = new ListNode(0), t = l;
27        while(l1 != null && l2 != null){
28            if(l1.val <= l2.val){
29                t.next = l1;
30                l1 = l1.next;
31            } else {
32                t.next = l2;
33                l2 = l2.next;
34            }
35            t = t.next;
36        }
37        if(l1 == null){
38            t.next = l2;
39        }
40        if(l2 == null){
41            t.next = l1;
42        }
43        return l.next;
44    }
45}