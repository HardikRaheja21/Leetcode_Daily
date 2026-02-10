// Last updated: 2/10/2026, 3:14:26 PM
class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        char longestKey = keysPressed.charAt(0);
        int maxDuration = releaseTimes[0];

        for(int i = 1; i < releaseTimes.length; i++){
            int duration = releaseTimes[i] - releaseTimes[i - 1];
            char currentKey = keysPressed.charAt(i);

            if(duration > maxDuration || (duration == maxDuration && currentKey > longestKey)){
                maxDuration = duration;
                longestKey = currentKey;
            }
        }
        return longestKey;
    }
}