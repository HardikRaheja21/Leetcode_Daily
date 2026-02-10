// Last updated: 2/10/2026, 3:09:47 PM
class Solution {
    public int maxDistinct(String s) {
        int[] freq = new int[26];
        for(char ch : s.toCharArray()){
            freq[ch- 'a']++;
        }
        int count = 0;
        for(int i = 0; i < 26; i++){
            if(freq[i] > 0) count++;
        }
        return count;
    }
}