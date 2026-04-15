// Last updated: 4/15/2026, 7:16:24 AM
1class Solution {
2    public int closestTarget(String[] words, String target, int startIndex) {
3        int n = words.length;
4        int minDistance = Integer.MAX_VALUE;
5
6        for(int i = 0; i < n; i++){
7            if(words[i].equals(target)){
8                int forward = (i - startIndex + n) % n;
9                int backward = (startIndex - i + n) % n;
10                minDistance = Math.min(minDistance, Math.min(forward, backward));
11            }
12        }
13
14        return minDistance == Integer.MAX_VALUE ? -1 : minDistance;
15    }
16}