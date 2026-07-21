// Last updated: 7/21/2026, 1:30:09 PM
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
12    private ListNode nextNode(ListNode node){
13        int val = node.val;
14        if(node.next == null || node.val != node.next.val) return node;
15        while(node != null && node.val == val) node = node.next;
16        return node;
17    }
18    public ListNode deleteDuplicates(ListNode head) {
19        if(head == null || head.next == null) return head;
20        ListNode dummy = new ListNode(0);
21        dummy.next = head;
22        ListNode node = dummy;
23        while(node != null && node.next != null){
24            ListNode next = nextNode(node.next);
25            node.next = next;
26            if(next == null || next.next == null) break;
27            if(next.val != next.next.val) node = node.next;
28        } 
29        return dummy.next;
30    }
31}