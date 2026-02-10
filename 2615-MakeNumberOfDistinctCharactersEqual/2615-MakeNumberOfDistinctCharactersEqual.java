// Last updated: 2/10/2026, 3:12:42 PM
class Solution {
    public boolean isItPossible(String word1, String word2) {
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        for(char ch : word1.toCharArray()) freq1[ch - 'a']++;
        for(char ch : word2.toCharArray()) freq2[ch - 'a']++;

        for(int i = 0; i < 26; i++){
            if(freq1[i] == 0) continue;
            for(int j = 0; j < 26; j++){
                if(freq2[j] == 0) continue;

                int[] temp1 = freq1.clone();
                int[] temp2 = freq2.clone();

                temp1[i]--; temp2[j]--;
                temp1[j]++; temp2[i]++;

                int d1 = 0, d2 = 0;
                for(int k = 0; k < 26; k++){
                    if(temp1[k] > 0) d1++;
                    if(temp2[k] > 0) d2++;
                }
                if(d1 == d2) return true;
            }
        }
        return false;
    }
}