// Last updated: 2/10/2026, 3:12:58 PM
class Solution {
    public int smallestEvenMultiple(int n) {
        if(n % 2 == 0){
            return n;
        }
        else{
            return 2 * n;
        }
    }
}