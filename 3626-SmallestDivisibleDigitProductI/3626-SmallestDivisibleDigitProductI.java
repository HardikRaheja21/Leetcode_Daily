// Last updated: 2/10/2026, 3:11:18 PM
class Solution {
    public int smallestNumber(int n, int t) {

        while (n < Integer.MAX_VALUE) {
            if (productDivisible(n, t)) {
                return n;
            }
            n++;
        }
        return -1;
    }

    private boolean productDivisible(int number, int t) {
        long prod = 1;   // use long to avoid overflow quickly
        int x = number;

        while (x > 0) {
            int digit = x % 10;
            prod *= digit;

            // early break
            if (prod % t == 0) return true;

            x /= 10;
        }
        return (prod % t == 0);
    }
    public String convertToString(int num){
        String s = "";
        while(num > 0){
            s += num % 10;
            num /= 10;
        }
        return s;
    }
}