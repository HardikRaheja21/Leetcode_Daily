// Last updated: 2/10/2026, 3:09:50 PM
class Solution {
    public String maxSumOfSquares(int num, int sum) {
        int drevantor = sum * num;
        if(sum > 9 * num) return "";
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < num; i++){
            int digit = Math.min(9, sum);
            sb.append(digit);
            sum -= digit;
        }
        if(sum != 0) return "";
        return sb.toString();
    }
}