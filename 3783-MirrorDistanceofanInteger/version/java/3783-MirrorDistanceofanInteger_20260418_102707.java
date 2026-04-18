// Last updated: 4/18/2026, 10:27:07 AM
1class Solution {
2    public int mirrorDistance(int n) {
3        return Math.abs(n - reverse(n));
4    }
5    public int reverse(int n){
6        String s = Integer.toString(n);
7        String rev = new StringBuilder(s).reverse().toString();
8        return Integer.parseInt(rev);
9    }
10}