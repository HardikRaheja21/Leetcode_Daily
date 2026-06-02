// Last updated: 6/2/2026, 3:54:16 PM
1class Solution {
2    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
3        int minTime = Integer.MAX_VALUE;
4        for(int i = 0; i < landStartTime.length; i++){
5            for(int j = 0; j < waterStartTime.length; j++){
6                int landEnd = landStartTime[i] + landDuration[i];
7                int waterStart = Math.max(waterStartTime[j], landEnd);
8                minTime = Math.min(minTime, waterStart + waterDuration[j]);
9
10                int waterEnd = waterStartTime[j] + waterDuration[j];
11                int landStart = Math.max(waterEnd, landStartTime[i]);
12                minTime = Math.min(minTime, landStart + landDuration[i]);
13            }
14        }
15        return minTime;
16    }
17}