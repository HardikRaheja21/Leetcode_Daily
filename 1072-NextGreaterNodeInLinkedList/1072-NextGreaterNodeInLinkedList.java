// Last updated: 2/10/2026, 3:15:31 PM
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
    public int[] nextLargerNodes(ListNode head) {

        // Step 1: Convert LinkedList to Array
        List<Integer> list = new ArrayList<>();
        ListNode temp = head;
        while (temp != null) {
            list.add(temp.val);
            temp = temp.next;
        }

        int n = list.size();
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();

        // Step 2: Monotonic Stack (Next Greater Element)
        for (int i = n - 1; i >= 0; i--) {
            int curr = list.get(i);

            while (!st.isEmpty() && st.peek() <= curr) {
                st.pop();
            }

            ans[i] = st.isEmpty() ? 0 : st.peek();
            st.push(curr);
        }

        return ans;
    }
}