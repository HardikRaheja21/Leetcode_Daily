// Last updated: 2/10/2026, 3:16:51 PM
class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>(); // stores indices

        for (int i = 2 * n - 1; i >= 0; i--) {
            int idx = i % n;

            while (!st.isEmpty() && nums[st.peek()] <= nums[idx]) {
                st.pop();
            }

            ans[idx] = st.isEmpty() ? -1 : nums[st.peek()];

            st.push(idx);
        }

        return ans;
    }
}
