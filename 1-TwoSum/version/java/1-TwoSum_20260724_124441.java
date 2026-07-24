// Last updated: 7/24/2026, 12:44:41 PM
1class Solution {
2    public int largestAltitude(int[] gain) {
3        int currentAltitude = 0;
4        int maxAltitude = 0;
5        for(int i = 0; i < gain.length; i++){
6            currentAltitude += gain[i];
7            maxAltitude = Math.max(currentAltitude, maxAltitude);
8        }
9        return maxAltitude;
10    }
11}