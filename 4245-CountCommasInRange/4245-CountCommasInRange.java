// Last updated: 3/23/2026, 5:28:24 PM
class Solution {
    public int countCommas(int n) {
        if(n < 1000) return 0;
        return n - 999;
    }
}