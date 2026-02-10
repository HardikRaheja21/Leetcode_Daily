// Last updated: 2/10/2026, 3:13:15 PM
class Solution {
    public int totalSteps(int[] nums) {
        Stack<int[]> st = new Stack<>();
        int steps = 0;
        for(int i = nums.length - 1; i >= 0; i--){
            int cnt = 0;
            while(!st.isEmpty() && nums[i] > st.peek()[0]){
                cnt = Math.max(cnt + 1, st.peek()[1]);
                st.pop();
            }
            steps = Math.max(steps, cnt);
            st.push(new int[]{nums[i], cnt});
        }
        return steps;
    }
}