// Last updated: 2/10/2026, 3:12:32 PM
class Solution {
    public long repairCars(int[] ranks, int cars) {
        long low = 1;
        long high = 0;
        int minRank = Integer.MAX_VALUE;
        for(int r : ranks) minRank = Math.min(minRank, r);
        high = (long) minRank * cars * cars;
        while(low < high){
            long mid = low + (high - low) / 2;
            if(canRepair(ranks, cars, mid)) high = mid;
            else low = mid + 1;
        }
        return low;
    }
    public boolean canRepair(int[] ranks, int cars, long time){
        long repaired = 0;
        for(int r : ranks){
            repaired += (long) Math.sqrt(time / r);
            if(repaired >= cars) return true;
        }
        return repaired >= cars;
    }
}