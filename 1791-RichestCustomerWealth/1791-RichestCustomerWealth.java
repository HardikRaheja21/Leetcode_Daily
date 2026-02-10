// Last updated: 2/10/2026, 3:14:17 PM
class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for(int i = 0; i < accounts.length; i++){
            int maxWind = 0;
            for(int j = 0; j < accounts[i].length; j++){
                maxWind += accounts[i][j];
            }
            max = Math.max(max, maxWind);
        }
        return max;
    }
}