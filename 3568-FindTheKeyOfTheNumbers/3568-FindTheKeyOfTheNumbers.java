// Last updated: 2/10/2026, 3:11:24 PM
class Solution {
    public int generateKey(int num1, int num2, int num3) {
        // Convert the numbers to four-digit strings, padding with leading zeros if necessary
        String str1 = String.format("%04d", num1);
        String str2 = String.format("%04d", num2);
        String str3 = String.format("%04d", num3);

        StringBuilder key = new StringBuilder();

        // Iterate through each of the 4 positions
        for (int i = 0; i < 4; i++) {
            // Get the i-th digit from each number
            char digit1 = str1.charAt(i);
            char digit2 = str2.charAt(i);
            char digit3 = str3.charAt(i);

            // Find the minimum of the three digits
            char minDigit = (char) Math.min(digit1, Math.min(digit2, digit3));

            // Append the minimum digit to the key
            key.append(minDigit);
        }

        // Convert the key to an integer to remove leading zeros and return it
        return Integer.parseInt(key.toString());
    }
}