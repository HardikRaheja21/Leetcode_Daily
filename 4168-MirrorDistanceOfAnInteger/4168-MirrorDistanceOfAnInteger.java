// Last updated: 2/10/2026, 3:09:41 PM
class Solution {
    public int mirrorDistance(int n) {
        return Math.abs(n - reverse(n));
    }
    public int reverse(int n){
        String s = Integer.toString(n);
        String rev = new StringBuilder(s).reverse().toString();
        return Integer.parseInt(rev);
    }
}