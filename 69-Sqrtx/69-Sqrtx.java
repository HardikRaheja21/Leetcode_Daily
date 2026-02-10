// Last updated: 2/10/2026, 3:19:41 PM
class Solution {
    public int mySqrt(int x) {
        int low = 0, high = x;
        while(low <= high){
            long mid = low + (high - low) / 2;
            long product = (mid * mid);
            if(product <= x){
                low = (int) mid + 1;
            } else {
                high = (int) mid - 1;
            }
        }
        return high;
    }
}