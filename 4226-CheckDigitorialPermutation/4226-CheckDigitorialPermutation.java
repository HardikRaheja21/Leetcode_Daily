// Last updated: 2/22/2026, 10:38:01 PM
class Solution {
    public boolean isDigitorialPermutation(int n) {
        int num = n;
        long sum = factSum(num);
        if(countDigits(sum) != countDigits(num)) return false;
        return sameDigits(sum, num);
    }
    private long factSum(int n){
        long sum = 0;
        int num = n;
        while(num > 0){
            sum += fact(num % 10);
            num /= 10;
        }
        return sum;
    }
    private long fact(int n){
        int num = n;
        long fact = 1;
        for(int i = 1; i <= n; i++){
            fact *= i;
        }
        return fact;
    }
    private boolean sameDigits(long a, long b){
        char[] x = String.valueOf(a).toCharArray();
        char[] y = String.valueOf(b).toCharArray();
        Arrays.sort(x);
        Arrays.sort(y);
        return Arrays.equals(x, y);
    }
    private int countDigits(long n){
        return String.valueOf(n).length();
    }
}