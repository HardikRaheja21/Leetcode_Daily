// Last updated: 2/10/2026, 3:13:48 PM
class Solution {
    public int getLucky(String s, int k) {
        // Step 1: Convert the string to its corresponding alphabet positions and concatenate as a string
        StringBuilder numString = new StringBuilder();
        for (char c : s.toCharArray()) {
            int value = c - 'a' + 1;
            numString.append(value);
        }
        
        // Step 2: Convert the concatenated string to an integer by summing its digits
        int result = 0;
        for (char c : numString.toString().toCharArray()) {
            result += c - '0';
        }
        
        // Step 3: Perform k-1 transformations (we've already done the first transform above)
        for (int i = 1; i < k; i++) {
            result = sumOfDigits(result);
        }
        
        return result;
    }

    // Helper method to sum digits of an integer
    private int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}