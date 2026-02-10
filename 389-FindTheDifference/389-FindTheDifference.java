// Last updated: 2/10/2026, 3:17:21 PM
class Solution {
    public char findTheDifference(String s, String t) {
        int[] occurrenceOfChar = new int[26];
        for(char ch : s.toCharArray()){
            occurrenceOfChar[ch - 'a']++;
        }
        for(char ch : t.toCharArray()){
            occurrenceOfChar[ch - 'a']--;
        }
        for(int i = 0; i < occurrenceOfChar.length; i++){
            if(occurrenceOfChar[i] < 0) {
                return (char) (i + 'a');
            }
        }
        return ' ';
    }
}