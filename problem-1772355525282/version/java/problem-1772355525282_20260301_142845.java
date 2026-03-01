// Last updated: 3/1/2026, 2:28:45 PM
1class Solution {
2    public String trimTrailingVowels(String s) {
3        StringBuilder sb = new StringBuilder(s);
4        for(int i = sb.length() - 1; i >= 0; i--){
5            char ch = sb.charAt(i);
6            if(!isVowel(ch)) break;
7            if(isVowel(ch)) sb.deleteCharAt(i);
8        }
9        return sb.toString();
10    }
11    private boolean isVowel(char ch){
12        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') return true;
13        return false;
14    }
15}