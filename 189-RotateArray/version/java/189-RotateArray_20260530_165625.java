// Last updated: 5/30/2026, 4:56:25 PM
1class Solution {
2    public void rotate(int[] nums, int k) {
3        int n = nums.length;
4        k = k % n;
5        int[] ans = new int[n];
6        int index = 0;
7        for(int i = n - k; i < n; i++){
8            ans[index++] = nums[i];
9        }
10        for(int i = 0; i < n - k; i++){
11            ans[index++] = nums[i];
12        }
13        for(int i = 0; i < n; i++){
14            nums[i] = ans[i];
15        }
16        // return nums;
17    }
18}