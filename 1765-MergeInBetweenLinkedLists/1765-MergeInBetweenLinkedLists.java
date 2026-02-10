// Last updated: 2/10/2026, 3:14:22 PM
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode temp = list1;
        int move = 0;
        while(move < a - 1){
            temp = temp.next;
            move++;
        }
        ListNode store = temp;
        while(move <= b){
            store = store.next;
            move++;
        }
        temp.next = list2;
        while(list2.next != null){
            list2 = list2.next;
        }
        list2.next = store;
        return list1;
    }
}