// Last updated: 2/10/2026, 3:17:24 PM
class Solution {
    public boolean isPerfectSquare(int num) {
        long low = 0, high = num;
        while(low <= high){
            long mid = low + (high - low) / 2;
            long square = mid * mid;
            if(square == num) return true;
            else if(square < num) low = mid + 1;
            else high = mid - 1;
        }
        return false;
    }
}