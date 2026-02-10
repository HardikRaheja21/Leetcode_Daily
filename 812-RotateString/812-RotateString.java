// Last updated: 2/10/2026, 3:16:18 PM
class Solution {
    public boolean rotateString(String s, String goal) {
        // Check if lengths are the same; if not, they can't be rotations of each other
        if (s.length() != goal.length()) {
            return false;
        }
        
        // Concatenate s with itself
        String doubled = s + s;
        
        // Check if goal is a substring of the concatenated string
        return doubled.contains(goal);
    }
}