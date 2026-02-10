// Last updated: 2/10/2026, 3:15:38 PM
class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> result = new ArrayList<>();
        int n = num.length;
        int carry = 0;

        int i = n - 1;

        while(i >= 0 || k > 0 || carry > 0){
            int numDigit = (i >= 0) ? num[i] : 0;
            int kDigit = k % 10;

            int sum = numDigit + kDigit +carry;
            result.add(sum % 10);
            carry = sum / 10;

            i--;
            k /= 10;
        }
        Collections.reverse(result);
        return result;
    }
}