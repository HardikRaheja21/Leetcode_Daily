// Last updated: 2/13/2026, 7:39:16 AM
class Solution {
    public boolean mergeTriplets(int[][] triplets, int[] target) {
        int[] maxValues = new int[3];
        for(int[] triple : triplets){
            if(triple[0] <= target[0] && triple[1] <= target[1] && triple[2] <= target[2]){
                maxValues[0] = Math.max(maxValues[0], triple[0]);
                maxValues[1] = Math.max(maxValues[1], triple[1]);
                maxValues[2] = Math.max(maxValues[2], triple[2]);
            }
        }
        return maxValues[0] == target[0] && maxValues[1] == target[1] && maxValues[2] == target[2];
    }
}