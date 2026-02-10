// Last updated: 2/10/2026, 3:17:12 PM
class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0, right = 0, maxLen = 0, maxFreq = 0, n = s.length();
        int[] freq = new int[26];
        while(right < n){
            freq[s.charAt(right) - 'A']++;
            maxFreq = Math.max(maxFreq, freq[s.charAt(right) - 'A']);
            while(right - left + 1 - maxFreq > k){
                freq[s.charAt(left) - 'A']--;
                left++;
            }
            if(right - left + 1 - maxFreq <= k){
                maxLen = Math.max(maxLen, right - left + 1);
            }
            right++;
        }
        return maxLen;
    }
}