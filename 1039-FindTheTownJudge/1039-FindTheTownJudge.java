// Last updated: 2/10/2026, 3:15:37 PM
class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] trustScore = new int[n + 1];
        for(int[] pairs : trust){
            int a = pairs[0];
            int b = pairs[1];

            trustScore[a]--;
            trustScore[b]++;
        }
        for(int i = 1; i <= n; i++){
            if(trustScore[i] == n - 1){
                return i;
            }
        }
        return -1;
    }
}