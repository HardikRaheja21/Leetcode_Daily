// Last updated: 2/10/2026, 3:14:02 PM
class Solution {
    public boolean squareIsWhite(String coordinates) {
        // Convert the letter part to a number (e.g., 'a' = 1, 'b' = 2, etc.)
        int x = coordinates.charAt(0) - 'a' + 1;
        
        // Convert the number part to an integer
        int y = Character.getNumericValue(coordinates.charAt(1));

        int[] coordinate = new int[]{x, y};

        return (x + y) % 2 != 0;
    }
}