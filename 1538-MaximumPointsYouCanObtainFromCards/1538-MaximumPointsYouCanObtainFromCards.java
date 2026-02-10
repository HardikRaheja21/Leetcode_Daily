// Last updated: 2/10/2026, 3:14:47 PM
class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int sum = 0, maxSum = 0;
        for(int i = 0; i < k; i++){
            maxSum += cardPoints[i];
        }
        sum = maxSum;
        int rightIdx = cardPoints.length - 1;
        for(int i = k - 1; i >= 0; i--){
            sum -= cardPoints[i];
            sum += cardPoints[rightIdx];
            rightIdx--;
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
}