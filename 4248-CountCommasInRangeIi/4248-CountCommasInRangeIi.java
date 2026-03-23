// Last updated: 3/23/2026, 5:28:22 PM
class Solution {
    public long countCommas(long n) {
        long ans = 0;
        for(int k = 1; k <= 5; k++){
            long start = (long) Math.pow(10, 3 * k);
            if(start > n) break;
            long end = Math.min(n, (long) Math.pow(10, 3 * (k + 1)) - 1);
            ans += (end - start + 1) * k;
            
        }
        return ans;
    }
}