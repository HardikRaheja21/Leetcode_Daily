// Last updated: 2/10/2026, 3:12:14 PM
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
    public static ListNode reverse(ListNode head) {
        if (head == null || head.next == null) { // Base case: check if head is null
        return head;
    }
    ListNode newHead = reverse(head.next);
    head.next.next = head; // Reversing the link
    head.next = null; // Prevent cycle
    return newHead;
    }
    public ListNode doubleIt(ListNode head) {
        ListNode reverse1 = reverse(head);  
        return reverse(multiply(reverse1));      
    }
    public ListNode multiply(ListNode l1) {
        ListNode dummy=new ListNode(-1);
        ListNode temp1=l1;
        ListNode curr=dummy;
        int carry=0;
        while(temp1!=null){
            int sum=carry;
            if(temp1!=null) sum += temp1.val * 2;
            ListNode newt=new ListNode(sum%10);
            carry=sum/10;
            curr.next=newt;
            curr=curr.next;
            if(temp1!=null) temp1=temp1.next;
        }
        if(carry>0){
            ListNode newr=new ListNode(carry);
            curr.next=newr;
            curr=curr.next;
        }
        return dummy.next;
    }
}