// Last updated: 2/10/2026, 3:11:07 PM
class Solution {
    public boolean hasSameDigits(String s) {
        // Keep performing operations until only two digits remain
        while (s.length() > 2) {
            StringBuilder next = new StringBuilder();
            for (int i = 0; i < s.length() - 1; i++) {
                int a = s.charAt(i) - '0';
                int b = s.charAt(i + 1) - '0';
                int sum = (a + b) % 10;
                next.append(sum);
            }
            s = next.toString();
        }

        // Check if the final two digits are equal
        return s.charAt(0) == s.charAt(1);
    }
}