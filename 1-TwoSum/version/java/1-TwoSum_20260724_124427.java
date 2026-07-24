// Last updated: 7/24/2026, 12:44:27 PM
1class Solution {
2    public int firstMissingPositive(int[] nums) {
3        Set<Integer> set = new HashSet<>();
4        for(int i = 0; i < nums.length; i++){
5            set.add(nums[i]);
6        }
7        int num = 1;
8        int max = Integer.MAX_VALUE;
9        for(int i = 0; i < num + 1; i++){
10            if(!set.contains(num)) return num;
11            else num++;
12        }
13        return num;
14    }
15}