// Last updated: 3/5/2026, 12:07:30 PM
1class Solution {
2    public int minOperations(String s) {
3        int op1 = 0, op2 = 0;
4        for(int i = 0; i < s.length(); i++){
5            char expected1 = (i % 2 == 0) ? '0' : '1';
6            char expected2 = (i % 2 == 0) ? '1' : '0';
7            if(s.charAt(i) != expected1) op1++;
8            if(s.charAt(i) != expected2) op2++;
9        }
10        return Math.min(op1, op2);
11    }
12}