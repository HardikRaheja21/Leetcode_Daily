// Last updated: 3/1/2026, 2:17:06 PM
1class Solution {
2    public int minPartitions(String n) {
3        int digit = 0;
4        for(char ch : n.toCharArray()){
5            digit = Math.max(digit, ch - '0');
6        }
7        return digit;
8    }
9}