// Last updated: 7/24/2026, 4:29:51 PM
1class Solution {
2    public int numberOfSubstrings(String s) {
3        int[] lastSeen = {-1, -1, -1};
4        int count = 0;
5        for(int i = 0; i < s.length(); i++){
6            lastSeen[s.charAt(i) - 'a'] = i;
7            if(lastSeen[0] != -1 && lastSeen[1] != -1 && lastSeen[2] != -1){
8                count += (1 + Math.min(lastSeen[0], Math.min(lastSeen[1], lastSeen[2])));
9            }
10        }
11        return count;
12    }
13}