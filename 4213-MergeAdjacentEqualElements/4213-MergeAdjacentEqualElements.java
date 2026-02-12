// Last updated: 2/12/2026, 5:33:43 PM
class Solution {
    public List<Long> mergeAdjacent(int[] nums) {
        Stack<Long> st = new Stack<>();

        for (int x : nums) {
            long curr = x;

            while (!st.isEmpty() && st.peek() == curr) {
                curr += st.pop();
            }

            st.push(curr);
        }

        return new ArrayList<>(st);
    }
}