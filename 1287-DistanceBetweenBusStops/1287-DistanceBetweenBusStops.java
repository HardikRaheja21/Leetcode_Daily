// Last updated: 2/10/2026, 3:15:12 PM
class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        if(start > destination){
            int temp = start;
            start = destination; 
            destination = temp;
        }

        int clockWise = 0;
        for(int i = start; i < destination; i++){
            clockWise += distance[i];
        }

        int totalDistance = 0;
        for(int dist : distance){
            totalDistance += dist;
        }
        int counterClockWise = totalDistance - clockWise;

        return Math.min(clockWise, counterClockWise);
    }
}