// Last updated: 3/1/2026, 2:03:18 PM
1class Solution {
2    public String mergeCharacters(String s, int k) {
3        String sl = s;
4        StringBuilder sb = new StringBuilder(s);
5        boolean merged = true;
6        while(merged){
7            merged = false;
8            for(int i = 0; i < sb.length(); i++){
9                for(int j = i + 1; j < sb.length(); j++){
10                    if(sb.charAt(i) == sb.charAt(j) && j - i <= k){
11                        sb.deleteCharAt(j);
12                        merged = true;
13                        break;
14                    }
15                }
16                if(merged) break;
17            }
18        }
19        return sb.toString();
20    }
21}