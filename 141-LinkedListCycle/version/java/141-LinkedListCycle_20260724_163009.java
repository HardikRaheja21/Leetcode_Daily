// Last updated: 7/24/2026, 4:30:09 PM
1class Solution {
2    public int characterReplacement(String s, int k) {
3        int left = 0, right = 0, maxLen = 0, maxFreq = 0, n = s.length();
4        int[] freq = new int[26];
5        while(right < n){
6            freq[s.charAt(right) - 'A']++;
7            maxFreq = Math.max(maxFreq, freq[s.charAt(right) - 'A']);
8            while(right - left + 1 - maxFreq > k){
9                freq[s.charAt(left) - 'A']--;
10                left++;
11            }
12            if(right - left + 1 - maxFreq <= k){
13                maxLen = Math.max(maxLen, right - left + 1);
14            }
15            right++;
16        }
17        return maxLen;
18    }
19}