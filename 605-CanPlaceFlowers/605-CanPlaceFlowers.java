// Last updated: 2/10/2026, 3:16:41 PM
class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;  // Count of flowers that can be planted

        for (int i = 0; i < flowerbed.length; i++) {
            // Check if the current plot is empty (0), the previous plot (if exists) is empty, and the next plot (if exists) is empty
            if (flowerbed[i] == 0 && (i == 0 || flowerbed[i - 1] == 0) && (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {
                flowerbed[i] = 1;  // Plant a flower here
                count++;           // Increase the count of planted flowers
                i++;               // Skip the next plot
            }
            if (count >= n) {
                return true;  // If we've planted enough flowers, return true
            }
        }

        return count >= n;  // If we couldn't plant enough flowers, return false
    }
}