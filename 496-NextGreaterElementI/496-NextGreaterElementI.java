// Last updated: 2/10/2026, 3:16:54 PM
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        Stack<Integer> st = new Stack<>();
        HashMap<Integer, Integer> ngeMap = new HashMap<>();

        // Build NGE for nums2
        for (int i = nums2.length - 1; i >= 0; i--) {

            while (!st.isEmpty() && st.peek() <= nums2[i]) {
                st.pop();
            }

            int nge = st.isEmpty() ? -1 : st.peek();
            ngeMap.put(nums2[i], nge);

            st.push(nums2[i]);
        }

        // Answer nums1 queries
        int[] ans = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            ans[i] = ngeMap.get(nums1[i]);
        }

        return ans;
    }
}
