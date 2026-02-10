// Last updated: 2/10/2026, 3:10:55 PM
class Solution {
    public boolean checkDivisibility(int n) {
        int sum = 0;
        int prod = 1;
        int copyOfnum = n;
        while(n > 0){
            int value = n % 10;
            sum += value;
            prod *= value;
            n = n / 10;
        }
        return copyOfnum % (sum + prod) == 0;
    }
}