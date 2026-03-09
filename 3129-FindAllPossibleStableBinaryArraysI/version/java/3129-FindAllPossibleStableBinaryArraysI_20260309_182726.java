// Last updated: 3/9/2026, 6:27:26 PM
1class Solution {
2
3    int MOD = (int)1e9 + 7;
4    int[][][] dp;
5
6    public int numberOfStableArrays(int zero, int one, int limit) {
7
8        dp = new int[zero + 1][one + 1][2];
9
10        for(int i = 0; i <= zero; i++){
11            for(int j = 0; j <= one; j++){
12                dp[i][j][0] = -1;
13                dp[i][j][1] = -1;
14            }
15        }
16
17        int startWithZero = solve(one, zero, 1, limit);
18        int startWithOne = solve(one, zero, 0, limit);
19
20        return (startWithZero + startWithOne) % MOD;
21    }
22
23    private int solve(int onesLeft, int zerosLeft, int lastWasOne, int limit){
24
25        if(onesLeft == 0 && zerosLeft == 0){
26            return 1;
27        }
28
29        if(dp[zerosLeft][onesLeft][lastWasOne] != -1){
30            return dp[zerosLeft][onesLeft][lastWasOne];
31        }
32
33        long result = 0;
34
35        if(lastWasOne == 1){
36            // explore placing 0s
37            for(int len = 1; len <= Math.min(zerosLeft, limit); len++){
38                result = (result + solve(onesLeft, zerosLeft - len, 0, limit)) % MOD;
39            }
40        } 
41        else{
42            // explore placing 1s
43            for(int len = 1; len <= Math.min(onesLeft, limit); len++){
44                result = (result + solve(onesLeft - len, zerosLeft, 1, limit)) % MOD;
45            }
46        }
47
48        return dp[zerosLeft][onesLeft][lastWasOne] = (int)result;
49    }
50}