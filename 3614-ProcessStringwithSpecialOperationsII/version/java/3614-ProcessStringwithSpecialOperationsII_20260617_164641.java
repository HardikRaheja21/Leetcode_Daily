// Last updated: 6/17/2026, 4:46:41 PM
1class Solution {
2    public char processStr(String s, long k) {
3        int n = s.length();
4        List<Long> lengths = new ArrayList<>(n);
5        long currlen  = 0;
6
7        for(char ch : s.toCharArray()){
8            if(Character.isLowerCase(ch)) currlen++;
9            else if(ch == '*'){
10                if(currlen > 0) currlen--;
11            } else if(ch == '#'){
12                currlen = Math.min(currlen * 2, (long) 1e15 + 1);
13            } else if(ch == '%'){}
14            lengths.add(currlen);
15        }
16        if(k >= currlen) return '.';
17
18        for(int i = n - 1; i >= 0; i--){
19            char ch = s.charAt(i);
20            long prevlen = (i == 0) ? 0 :  lengths.get(i - 1);
21            long curr = lengths.get(i);
22            if(ch == '*'){
23                if(prevlen < curr) k++;
24            } else if(ch == '#'){
25                if(k >= prevlen){
26                    k -= prevlen;
27                }
28            } else if(ch == '%'){
29                k = curr - 1 - k;
30            } else {
31                if(curr - prevlen == 1){
32                    if(k == curr - 1){
33                        return ch;
34                    } else curr--;
35                }
36            }
37        }
38        return '.';
39    }
40}