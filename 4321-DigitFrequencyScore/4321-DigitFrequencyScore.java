// Last updated: 6/30/2026, 12:07:06 PM
class Solution {
    public int digitFrequencyScore(int n) {
        int[] freq = new int[10];
        int score = 0;
        while(n > 0){
            int d = n % 10;
            n = n / 10;
            freq[d]++;
        }
        for(int i = 0; i < 10; i++){
            score += (i * freq[i]);
        }
        return score;
        
    }
}