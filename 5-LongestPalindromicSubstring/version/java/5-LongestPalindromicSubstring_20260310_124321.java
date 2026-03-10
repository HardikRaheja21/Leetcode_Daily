// Last updated: 3/10/2026, 12:43:21 PM
1class Solution {
2    public String longestPalindrome(String s) {
3        if(s.length() <= 1) return s;
4        String maxStr = s.substring(0, 1);
5        for(int i = 0; i < s.length(); i++){
6            String odd = expandFromCenter(s, i, i);
7            String even = expandFromCenter(s, i, i + 1);
8            if(odd.length() > maxStr.length()) maxStr = odd;
9            if(even.length() > maxStr.length()) maxStr = even;
10        }
11        return maxStr;
12    }
13    public String expandFromCenter(String s, int left, int right){
14        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
15            left--;
16            right++;
17        }
18        return s.substring(left + 1, right);
19    }
20}