// Last updated: 3/10/2026, 10:36:28 AM
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
17        int startWithZero = 0;
18        int startWithOne = 0;
19
20        for(int len = 1; len <= Math.min(zero, limit); len++){
21            startWithZero = (startWithZero + solve(one, zero - len, 0, limit)) % MOD;
22        }
23
24        for(int len = 1; len <= Math.min(one, limit); len++){
25            startWithOne = (startWithOne + solve(one - len, zero, 1, limit)) % MOD;
26        }
27
28        return (startWithZero + startWithOne) % MOD;
29    }
30
31    private int solve(int onesLeft, int zerosLeft, int lastWasOne, int limit){
32
33        if(onesLeft == 0 && zerosLeft == 0){
34            return 1;
35        }
36
37        if(dp[zerosLeft][onesLeft][lastWasOne] != -1){
38            return dp[zerosLeft][onesLeft][lastWasOne];
39        }
40
41        long result = 0;
42
43        if(lastWasOne == 1){
44            for(int len = 1; len <= Math.min(zerosLeft, limit); len++){
45                result = (result + solve(onesLeft, zerosLeft - len, 0, limit)) % MOD;
46            }
47        } 
48        else{
49            for(int len = 1; len <= Math.min(onesLeft, limit); len++){
50                result = (result + solve(onesLeft - len, zerosLeft, 1, limit)) % MOD;
51            }
52        }
53
54        return dp[zerosLeft][onesLeft][lastWasOne] = (int)result;
55    }
56}