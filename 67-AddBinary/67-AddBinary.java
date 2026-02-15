// Last updated: 2/15/2026, 10:22:56 AM
1class Solution {
2    public String addBinary(String a, String b) {
3//         Approach:
4// Two Pointers: Start from the last digit of both binary strings a and b. Use two pointers i and j to traverse the strings from right to left.
5// Carry: Maintain a carry variable that stores the carryover value (either 0 or 1) from the previous addition.
6// Sum Calculation: For each position, sum the corresponding digits from a, b, and the carry. Convert the sum to the correct binary digit (sum % 2) and update the carry (sum / 2).
7// Final Carry: After processing all digits, if there's any remaining carry, add it to the result.
8// Result Construction: Build the resulting binary string by appending the calculated digits and then reverse the result at the end (since we append digits from least to most significant).
9        StringBuilder result = new StringBuilder();
10        int i = a.length() - 1;
11        int j = b.length() - 1;
12        int carry = 0;
13
14        // Process each digit from the least significant to the most significant
15        while (i >= 0 || j >= 0 || carry != 0){
16            int sum = carry;  //Initialoze sum as the current carry;
17
18            //Add the digit from a if i is within bounds
19            if(i >= 0){
20                sum += a.charAt(i) - '0';     //Convert the character to Integer
21                i--;        //Move to the next digit in a
22            }
23
24            //Add the digit from a if i is within bounds
25            if(j >= 0){
26                sum += b.charAt(j) - '0';   //Convert the character to Integer
27                j--;        //Move to the next digit in b
28            }
29
30            //Append the curret bit (sum % 2) to the result
31            result.append(sum % 2);
32
33            //Update carry (either 0 or 1) for the next addition
34            carry = sum / 2;
35        }
36
37        //The result is currently in reverse order, so we reverse it
38        return result.reverse().toString();
39    }
40}