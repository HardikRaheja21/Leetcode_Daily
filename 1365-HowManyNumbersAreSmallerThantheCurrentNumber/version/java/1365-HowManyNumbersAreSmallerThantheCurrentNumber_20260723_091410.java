// Last updated: 7/23/2026, 9:14:10 AM
1class Solution {
2    public int[] smallerNumbersThanCurrent(int[] nums) {
3         int[] allNums = new int[101];
4         int[] res = new int[nums.length];
5         for (int i = 0; i < nums.length; i++) {
6            allNums[nums[i]]++;
7        }
8        for (int i = 1; i < 101; i++) {
9            allNums[i] += allNums[i - 1];
10        }
11        for (int i = 0; i < nums.length; i++) {
12            if (nums[i] == 0) {
13                // If value is 0, no smaller numbers exist
14                res[i] = 0;
15            } else {
16                // Otherwise, count of numbers strictly less than nums[i]
17                res[i] = allNums[nums[i] - 1];
18            }
19        }
20        return res;
21    }
22}