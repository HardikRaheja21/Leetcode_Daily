// Last updated: 2/10/2026, 3:13:33 PM
class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxWords = 0;

        for(String sentence : sentences){
            int wordCount = sentence.split(" ").length;
            maxWords = Math.max(maxWords, wordCount);
        }
        return maxWords;
    }
}