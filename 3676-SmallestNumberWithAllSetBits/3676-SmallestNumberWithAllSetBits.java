// Last updated: 2/10/2026, 3:11:11 PM
class Solution {
    public int smallestNumber(int n) {
        int num = 1;
        while(num < n){
            num = (num << 1) | 1;
        }
        return num;
    }
}