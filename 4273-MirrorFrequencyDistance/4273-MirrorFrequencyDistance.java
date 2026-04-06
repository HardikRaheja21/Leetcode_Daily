// Last updated: 4/6/2026, 4:35:34 PM
class Solution {
    public int mirrorFrequency(String s) {
        int[] freq = new int[36];
        for(char ch : s.toCharArray()){
            if(Character.isLetter(ch)){
                freq[ch - 'a']++;
            } else {
                freq[26 + (ch - '0')]++;
            }
        }
        int ans = 0;
        for(char c = 'a'; c <= 'z'; c++){
            char m = (char) ('z' - (c - 'a'));
            if(c <= m){
                int freq1 = freq[c -'a'];
                int freq2 = freq[m - 'a'];
                ans += Math.abs(freq1 - freq2);
            }
        }
        for(char c = '0'; c <= '9'; c++){
            char m = (char) ('9' - (c - '0'));
            if(c <= m){
                int freq1 = freq[26 + (c - '0')];
                int freq2 = freq[26 + (m - '0')];
                ans += Math.abs(freq1 - freq2);
            }
        }
        return ans;
    }
}