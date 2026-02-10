// Last updated: 2/10/2026, 3:16:40 PM
class Solution {
    public boolean judgeSquareSum(int c) {
        long left = 0;
        long right = (long) Math.sqrt(c); // Use long to prevent overflow in multiplication

        while(left <= right){
            long sumOfSquare = left * left + right * right;

            if(sumOfSquare == c){
                return true;
            }
            else if(sumOfSquare < c){
                left++;
            }
            else {
                right--;
            }
        }
        return false;
    }
}