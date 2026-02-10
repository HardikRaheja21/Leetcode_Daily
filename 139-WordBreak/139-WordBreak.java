// Last updated: 2/10/2026, 3:18:50 PM
class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;
        Set<String> wordSet = new HashSet<>(wordDict);
        for(int i = 0; i <= s.length(); i++){
            for(int j = i - 1; j >= 0; j--){
                if(dp[j] && wordSet.contains(s.substring(j, i))){
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }
}