// Last updated: 4/8/2026, 1:46:34 PM
class Solution {

    int MOD = (int)1e9 + 7;
    int[][][] dp;

    public int numberOfStableArrays(int zero, int one, int limit) {

        dp = new int[zero + 1][one + 1][2];

        for(int i = 0; i <= zero; i++){
            for(int j = 0; j <= one; j++){
                dp[i][j][0] = -1;
                dp[i][j][1] = -1;
            }
        }

        int startWithZero = 0;
        int startWithOne = 0;

        for(int len = 1; len <= Math.min(zero, limit); len++){
            startWithZero = (startWithZero + solve(one, zero - len, 0, limit)) % MOD;
        }

        for(int len = 1; len <= Math.min(one, limit); len++){
            startWithOne = (startWithOne + solve(one - len, zero, 1, limit)) % MOD;
        }

        return (startWithZero + startWithOne) % MOD;
    }

    private int solve(int onesLeft, int zerosLeft, int lastWasOne, int limit){

        if(onesLeft == 0 && zerosLeft == 0){
            return 1;
        }

        if(dp[zerosLeft][onesLeft][lastWasOne] != -1){
            return dp[zerosLeft][onesLeft][lastWasOne];
        }

        long result = 0;

        if(lastWasOne == 1){
            for(int len = 1; len <= Math.min(zerosLeft, limit); len++){
                result = (result + solve(onesLeft, zerosLeft - len, 0, limit)) % MOD;
            }
        } 
        else{
            for(int len = 1; len <= Math.min(onesLeft, limit); len++){
                result = (result + solve(onesLeft - len, zerosLeft, 1, limit)) % MOD;
            }
        }

        return dp[zerosLeft][onesLeft][lastWasOne] = (int)result;
    }
}