// Last updated: 4/15/2026, 7:14:42 AM
1class Solution {
2    public int closetTarget(String[] words, String target, int startIndex) {
3        int n = words.length;
4        int minDistance = Integer.MAX_VALUE;
5        boolean found = false;
6
7        for(int i = 0; i < n; i++){
8            if(words[i].equals(target)){
9                found = true;
10
11                int forwardDistance = (i - startIndex + n) % n;
12                int backwardDistance = (startIndex - i + n) % n;
13                int currentDistance = Math.min(forwardDistance, backwardDistance);
14                minDistance = Math.min(minDistance, currentDistance);
15            }
16        }
17        return found ? minDistance : -1;
18    }
19}