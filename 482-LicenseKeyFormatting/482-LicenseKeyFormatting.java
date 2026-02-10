// Last updated: 2/10/2026, 3:17:02 PM
class Solution {
    public String licenseKeyFormatting(String s, int k) {
        // Remove all dashes and convert to uppercase
        StringBuilder cleaned = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c != '-') {
                cleaned.append(Character.toUpperCase(c));
            }
        }
        
        // Start inserting dashes from the end
        StringBuilder formatted = new StringBuilder();
        int length = cleaned.length();
        int firstGroupLength = length % k;

        // Add the first group if it has characters
        if (firstGroupLength > 0) {
            formatted.append(cleaned.substring(0, firstGroupLength));
        }

        // Process the remaining groups of size `k`
        for (int i = firstGroupLength; i < length; i += k) {
            if (formatted.length() > 0) {
                formatted.append('-'); // Insert dash between groups
            }
            formatted.append(cleaned.substring(i, i + k));
        }
        
        return formatted.toString();
    }
}