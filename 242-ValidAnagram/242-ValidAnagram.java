// Last updated: 2/10/2026, 3:17:54 PM
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        int[] sfreq = new int[26];
        for(char ch : s.toCharArray()){
            sfreq[ch - 'a']++;
        }
        for(char ch : t.toCharArray()){
            sfreq[ch - 'a']--;
        }
        for(int i = 0; i < 26; i++){
            if(sfreq[i] != 0) return false;
        }
        return true;
    }
}