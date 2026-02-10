// Last updated: 2/10/2026, 3:18:27 PM
class Solution {
    public int trailingZeroes(int n) {
        int count = 0;
        while(n >= 5){
            n /= 5;
            count += n;
        }
        return count;
    }
}