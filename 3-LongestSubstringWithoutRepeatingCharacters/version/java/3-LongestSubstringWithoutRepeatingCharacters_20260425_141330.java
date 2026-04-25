// Last updated: 4/25/2026, 2:13:30 PM
1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3        Set<Character> visited = new HashSet<>();
4        int left = 0;
5        int maxLen = 0;
6        for(int i = 0; i < s.length(); i++){
7            while(visited.contains(s.charAt(i))){
8                visited.remove(s.charAt(left));
9                left++;
10            }
11            visited.add(s.charAt(i));
12            maxLen = Math.max(maxLen, i - left + 1);
13        }
14        return maxLen;
15    }
16}