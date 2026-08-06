// Last updated: 8/6/2026, 1:03:09 PM
1class Solution {
2    public int smallestNumber(int n, int t) {
3
4        while (n < Integer.MAX_VALUE) {
5            if (productDivisible(n, t)) {
6                return n;
7            }
8            n++;
9        }
10        return -1;
11    }
12
13    private boolean productDivisible(int number, int t) {
14        long prod = 1;   // use long to avoid overflow quickly
15        int x = number;
16
17        while (x > 0) {
18            int digit = x % 10;
19            prod *= digit;
20
21            // early break
22            if (prod % t == 0) return true;
23
24            x /= 10;
25        }
26        return (prod % t == 0);
27    }
28    public String convertToString(int num){
29        String s = "";
30        while(num > 0){
31            s += num % 10;
32            num /= 10;
33        }
34        return s;
35    }
36}