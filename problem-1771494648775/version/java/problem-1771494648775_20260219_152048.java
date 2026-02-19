// Last updated: 2/19/2026, 3:20:48 PM
1class Solution {
2    public int prefixConnected(String[] words, int k) {
3        HashSet<String> prefixWords = new HashSet<>();
4        HashSet<String> counted = new HashSet<>();
5        int count = 0;
6        for(String word : words){
7            if(word.length() < k) continue;
8            String s = word.substring(0, k);
9            if(prefixWords.contains(s) && !counted.contains(s)){
10                count++;
11                counted.add(s);
12            }
13            else prefixWords.add(s);
14        }
15        return count;
16    }
17}