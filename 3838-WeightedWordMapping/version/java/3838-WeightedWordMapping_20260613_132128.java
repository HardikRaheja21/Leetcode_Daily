// Last updated: 6/13/2026, 1:21:28 PM
1class Solution {
2    public String mapWordWeights(String[] words, int[] weights) {
3        String result = "";
4        for(String word : words){
5            int sum = sumOfString(word, weights);
6            char ch = (char) ('a' + ((26 - sum) - 1));
7            result += ch;
8        }
9        return result;
10    }
11    private int sumOfString(String s, int[] weights){
12        int sum = 0;
13        for(int i = 0; i < s.length(); i++){
14            sum += weights[s.charAt(i) - 'a'];
15        }
16        return sum % 26;
17    }
18}