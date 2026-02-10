// Last updated: 2/10/2026, 3:15:27 PM
class Solution {
    public String gcdOfStrings(String str1, String str2) {
        // Check if str1 + str2 is the same as str2 + str1
        // If not, there's no common divisor string
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }
        
        // Compute the GCD of the lengths of str1 and str2
        int gcdLength = gcd(str1.length(), str2.length());
        
        // The result is the prefix of str1 up to the gcdLength
        return str1.substring(0, gcdLength);
    }
    
    // Helper function to compute the GCD of two numbers
    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b); 
    }
}