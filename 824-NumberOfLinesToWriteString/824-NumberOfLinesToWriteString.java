// Last updated: 2/10/2026, 3:16:16 PM
class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int lines = 1; // Start with one line
        int currentWidth = 0; // Width of the current line

        for (char c : s.toCharArray()) {
            int charWidth = widths[c - 'a']; // Get the width of the character

            // Check if adding this character exceeds the line limit
            if (currentWidth + charWidth > 100) {
                lines++; // Start a new line
                currentWidth = charWidth; // Reset width to the current character's width
            } else {
                currentWidth += charWidth; // Add the character's width to the current line
            }
        }

        return new int[]{lines, currentWidth};
    }
}