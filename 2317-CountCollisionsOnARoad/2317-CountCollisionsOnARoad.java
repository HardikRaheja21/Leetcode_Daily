// Last updated: 2/10/2026, 3:13:22 PM
class Solution {
    public int countCollisions(String directions) {
        char[] arr = directions.toCharArray();
        int n = arr.length;

        int left = 0, right = n - 1;

        // Skip all 'L' at the left end (they escape, no collision)
        while (left < n && arr[left] == 'L') left++;

        // Skip all 'R' at the right end (they escape, no collision)
        while (right >= 0 && arr[right] == 'R') right--;

        int collisions = 0;

        // In the middle part, count all cars that are not 'S'
        for (int i = left; i <= right; i++) {
            if (arr[i] != 'S') collisions++;
        }

        return collisions;
    }
}
