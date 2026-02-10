// Last updated: 2/10/2026, 3:13:20 PM
class Solution {
    public int countPrefixes(String[] words, String s) {
        int count = 0;
        for(int i = 0; i < words.length; i++){
            if(s.startsWith(words[i])){
                count++;
            }
        }
        return count;
    }
}