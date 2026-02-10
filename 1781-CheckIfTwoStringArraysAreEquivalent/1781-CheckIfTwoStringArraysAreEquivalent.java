// Last updated: 2/10/2026, 3:14:20 PM
class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder result1 = new StringBuilder();
        for(String word : word1){
            result1.append(word);
        }

        StringBuilder result2 = new StringBuilder();
        for(String word : word2){
            result2.append(word);
        }
        return result1.toString().equals(result2.toString());
    }
}