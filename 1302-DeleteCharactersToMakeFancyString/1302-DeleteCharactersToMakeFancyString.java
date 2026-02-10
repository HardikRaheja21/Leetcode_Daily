// Last updated: 2/10/2026, 3:15:10 PM
class Solution {
    public String makeFancyString(String s) {
        StringBuilder result = new StringBuilder();
        int consecutiveCount = 1;

        result.append(s.charAt(0));

        for (int i = 1; i < s.length(); i++) {
            // Check if the current character is the same as the previous one
            if (s.charAt(i) == s.charAt(i - 1)) {
                consecutiveCount++;
            } else {
                consecutiveCount = 1; // Reset the count if it's a new character
            }
            
            // Only add the character if we haven't reached three consecutive characters
            if (consecutiveCount < 3) {
                result.append(s.charAt(i));
            }
        }
        
        return result.toString();
    }
}