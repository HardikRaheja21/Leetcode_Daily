// Last updated: 2/26/2026, 6:51:21 AM
1class Solution {
2    public int numSteps(String s) {
3        int steps = 0;
4        StringBuilder sb = new StringBuilder(s);
5        while(!(sb.length() == 1 && sb.charAt(0) == '1')){
6            int n = sb.length();
7            if(sb.charAt(n - 1) == '0'){
8                sb.deleteCharAt(n - 1);
9            } else {
10                int i = n - 1;
11                while(i >= 0 && sb.charAt(i) == '1'){
12                    sb.setCharAt(i, '0');
13                    i--;
14                }
15                if(i < 0){
16                    sb.insert(0, '1');
17                } else {
18                    sb.setCharAt(i, '1');
19                }
20            }
21            steps++;
22        }        
23        return steps;
24    }
25}