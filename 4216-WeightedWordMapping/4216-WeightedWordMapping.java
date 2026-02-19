// Last updated: 2/19/2026, 3:11:04 PM
class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        String result = "";
        for(String word : words){
            int sum = sumOfString(word, weights);
            char ch = (char) ('a' + ((26 - sum) - 1));
            result += ch;
        }
        return result;
    }
    private int sumOfString(String s, int[] weights){
        int sum = 0;
        for(int i = 0; i < s.length(); i++){
            sum += weights[s.charAt(i) - 'a'];
        }
        return sum % 26;
    }
}