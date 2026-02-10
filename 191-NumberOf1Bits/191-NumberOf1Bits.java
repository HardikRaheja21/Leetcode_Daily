// Last updated: 2/10/2026, 3:18:24 PM
class Solution {
    public int hammingWeight(int n) {
        int count = 0;
        while(n != 0){
            n = n & (n - 1);
            count++;
        }
        return count;
    }
}