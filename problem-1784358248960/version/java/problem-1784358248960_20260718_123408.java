// Last updated: 7/18/2026, 12:34:08 PM
1class Solution {
2    public int findGCD(int[] nums) {
3        Arrays.sort(nums);
4        return gcd(nums[0], nums[nums.length - 1]);
5    }
6    public static int gcd(int a, int b) {
7        a = Math.abs(a);
8        b = Math.abs(b);
9
10        while (b != 0) {
11            int temp = b;
12            b = a % b;
13            a = temp;
14        }
15        return a;
16    }
17}