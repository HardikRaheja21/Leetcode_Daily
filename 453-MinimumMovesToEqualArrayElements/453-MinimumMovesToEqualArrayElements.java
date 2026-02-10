// Last updated: 2/10/2026, 3:17:04 PM
class Solution {
    public int minMoves(int[] nums) {
        int min = nums[0];
        int sum = 0;

        // Find the minimum element and calculate the total sum
        for (int num : nums) {
            min = Math.min(min, num);
            sum += num;
        }

        // The number of moves is the sum of the differences
        return sum - min * nums.length;
    }
}
