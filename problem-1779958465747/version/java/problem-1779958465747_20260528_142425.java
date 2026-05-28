// Last updated: 5/28/2026, 2:24:25 PM
1class Solution {
2    public boolean isSubsequence(String s, String t) {
3        int sp = 0, tp  = 0;
4        while(sp < s.length() && tp < t.length()){
5            if(s.charAt(sp) == t.charAt(tp)) sp++;
6            tp++;
7        }
8        return sp == s.length();
9    }
10}