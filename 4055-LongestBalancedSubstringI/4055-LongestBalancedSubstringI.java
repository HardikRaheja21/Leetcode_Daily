// Last updated: 2/12/2026, 5:34:02 PM
class Solution {
    public int longestBalanced(String s) {
        int n = s.length();
        int maxLen = 0;
        for(int i = 0; i < n; i++){
            int[] freq = new int[26];
            for(int j = i; j < n; j++){
                freq[s.charAt(j) - 'a']++;
                if(balanced(freq)) maxLen = Math.max(maxLen, j - i + 1);
            }
        }
        return maxLen;
    }
    private boolean balanced(int[] freq){
        int val = 0;
        for(int i = 0; i < 26; i++){
            if(freq[i] == 0) continue;
            if(val == 0) val = freq[i];
            if(freq[i] != val) return false;
        }
        return true;
    }
}