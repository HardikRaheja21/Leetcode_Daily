// Last updated: 7/24/2026, 12:44:06 PM
1class Solution {
2    public int[] twoSum(int[] nums, int target) {
3        Map<Integer, Integer> numMap = new HashMap<>();
4        int n = nums.length;
5
6        for (int i = 0; i < n; i++) {
7            int complement = target - nums[i];
8            if (numMap.containsKey(complement)) {
9                return new int[]{numMap.get(complement), i};
10            }
11            numMap.put(nums[i], i);
12        }
13
14        return new int[]{}; // No solution found
15    }
16}