// Last updated: 2/10/2026, 3:10:20 PM
class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int minTime = Integer.MAX_VALUE;
        for(int i = 0; i < landStartTime.length; i++){
            for(int j = 0; j < waterStartTime.length; j++){
                int landEnd = landStartTime[i] + landDuration[i];
                int waterStart = Math.max(waterStartTime[j], landEnd);
                minTime = Math.min(minTime, waterStart + waterDuration[j]);

                int waterEnd = waterStartTime[j] + waterDuration[j];
                int landStart = Math.max(waterEnd, landStartTime[i]);
                minTime = Math.min(minTime, landStart + landDuration[i]);
            }
        }
        return minTime;
    }
}