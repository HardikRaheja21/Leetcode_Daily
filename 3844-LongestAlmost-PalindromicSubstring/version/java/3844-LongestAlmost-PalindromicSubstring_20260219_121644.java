// Last updated: 2/19/2026, 12:16:44 PM
1class Solution {
2    public int almostPalindromic(String s) {
3        int n = s.length();
4        if (n <= 2)
5            return n;
6
7        int result = 1;
8        for (int i = 0; i < n; ++i) {
9            // Check two centers: odd (i,i) and even (i,i+1)
10            for (int t = 0; t < 2; ++t) {
11                int l0 = i, r0 = i + t;
12
13                // Expand the palindrome first
14                int[] p = expand(s, n, l0, r0);
15                int l = p[0], r = p[1];
16                result = Math.max(result, r - l);
17
18                // Skip one left
19                int[] p1 = expand(s, n, l - 1, r);
20                int l1 = p1[0], r1 = p1[1];
21                result = Math.max(result, r1 - l1 - 1);
22
23                // Skip one right
24                int[] p2 = expand(s, n, l, r + 1);
25                int l2 = p2[0], r2 = p2[1];
26                result = Math.max(result, r2 - l2 - 1);
27
28                // Early stop: substring can't be bigger than n
29                if (result >= n)
30                    return n;
31            }
32        }
33        return result;
34    }
35
36    private int[] expand(String s, int n, int l, int r) {
37        while (l >= 0 && r < n && s.charAt(l) == s.charAt(r)) { --l; ++r; }
38        return new int[] { l, r }; // palindrome is s[l+1 .. r-1]
39    }
40}