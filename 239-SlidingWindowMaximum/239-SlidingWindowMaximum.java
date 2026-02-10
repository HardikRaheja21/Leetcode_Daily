// Last updated: 2/10/2026, 3:17:55 PM
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] result = new int[n - k + 1];
        Deque<Integer> dp = new ArrayDeque<>();
        int idx = 0;
        for(int i = 0; i < n; i++){
            if(!dp.isEmpty() && dp.peekFirst() <= i - k) dp.pollFirst();
            while(!dp.isEmpty() && nums[dp.peekLast()] <= nums[i]) dp.pollLast();
            dp.offerLast(i);
            if(i >= k - 1) result[idx++] = nums[dp.peekFirst()];
        }
        return result;
    }
}