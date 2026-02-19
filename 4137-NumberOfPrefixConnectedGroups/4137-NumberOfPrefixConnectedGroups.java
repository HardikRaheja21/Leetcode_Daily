// Last updated: 2/19/2026, 3:22:34 PM
class Solution {
    public int prefixConnected(String[] words, int k) {
        HashSet<String> prefixWords = new HashSet<>();
        HashSet<String> counted = new HashSet<>();
        int count = 0;
        for(String word : words){
            if(word.length() < k) continue;
            String s = word.substring(0, k);
            if(prefixWords.contains(s) && !counted.contains(s)){
                count++;
                counted.add(s);
            }
            else prefixWords.add(s);
        }
        return count;
    }
}