// Last updated: 2/10/2026, 3:16:02 PM
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int maxNum = Integer.MIN_VALUE;
        for(int i = 0; i < piles.length; i++){
            maxNum = Math.max(maxNum, piles[i]);
        }
        int low = 1, high = maxNum;
        while(low <= high){
            int mid = low + (high - low) / 2;
            long hoursTaken = calculatetotalHours(piles, mid);
            if(hoursTaken <= h){
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
    public Long calculatetotalHours(int[] piles, int bananasPerHour){
        long totalHours = 0;
        for(int i = 0; i < piles.length; i++){
            totalHours += (piles[i] + bananasPerHour - 1) / bananasPerHour;
        }
        return totalHours;
    }
}