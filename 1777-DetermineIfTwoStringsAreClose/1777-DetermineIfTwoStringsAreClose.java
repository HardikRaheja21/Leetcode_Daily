// Last updated: 2/10/2026, 3:14:21 PM
class Solution {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length() != word2.length()) return false;
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        Set<Character> hs1 = new HashSet<>();
        Set<Character> hs2 = new HashSet<>();
        for(char ch : word1.toCharArray()){
            freq1[ch - 'a']++;
            hs1.add(ch);
        }
        for(char ch : word2.toCharArray()){
            freq2[ch - 'a']++;
            hs2.add(ch);
        }

        Arrays.sort(freq1);
        Arrays.sort(freq2);

        return hs1.equals(hs2) && Arrays.equals(freq1, freq2);
    }
}