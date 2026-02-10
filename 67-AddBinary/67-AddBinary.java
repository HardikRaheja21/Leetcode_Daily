// Last updated: 2/10/2026, 3:19:42 PM
class Solution {
    public String addBinary(String a, String b) {
//         Approach:
// Two Pointers: Start from the last digit of both binary strings a and b. Use two pointers i and j to traverse the strings from right to left.
// Carry: Maintain a carry variable that stores the carryover value (either 0 or 1) from the previous addition.
// Sum Calculation: For each position, sum the corresponding digits from a, b, and the carry. Convert the sum to the correct binary digit (sum % 2) and update the carry (sum / 2).
// Final Carry: After processing all digits, if there's any remaining carry, add it to the result.
// Result Construction: Build the resulting binary string by appending the calculated digits and then reverse the result at the end (since we append digits from least to most significant).
        StringBuilder result = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        // Process each digit from the least significant to the most significant
        while (i >= 0 || j >= 0 || carry != 0){
            int sum = carry;  //Initialoze sum as the current carry;

            //Add the digit from a if i is within bounds
            if(i >= 0){
                sum += a.charAt(i) - '0';     //Convert the character to Integer
                i--;        //Move to the next digit in a
            }

            //Add the digit from a if i is within bounds
            if(j >= 0){
                sum += b.charAt(j) - '0';   //Convert the character to Integer
                j--;        //Move to the next digit in b
            }

            //Append the curret bit (sum % 2) to the result
            result.append(sum % 2);

            //Update carry (either 0 or 1) for the next addition
            carry = sum / 2;
        }

        //The result is currently in reverse order, so we reverse it
        return result.reverse().toString();
    }
}