// Last updated: 2/10/2026, 3:18:02 PM
class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n <= 0){
            return false;
        }
        while(n % 2 == 0){
            n /= 2;
        }
        return n == 1;
    }
}