// Last updated: 8/11/2026, 9:24:22 AM
1class Solution {
2    public int missingInteger(int[] nums) {
3        Set<Integer> set = new HashSet<>();
4        for(int num : nums) set.add(num);
5        int sum = nums[0];
6        for(int i = 1; i < nums.length; i++){
7            if(nums[i] == nums[i - 1] + 1) sum += nums[i];
8            else break;
9        }
10        int x = sum;
11        while(set.contains(x)) x++;
12        return x;
13    }
14}