// Last updated: 4/28/2026, 5:50:37 PM
1class Solution {
2    public int getSum(int a, int b) {
3        int sum = 0, carry = 0;
4
5        while (b != 0) {
6            sum = a ^ b;
7            carry = (a & b) << 1;
8            a = sum;
9            b = carry;
10        }
11
12        return a;
13    }
14}