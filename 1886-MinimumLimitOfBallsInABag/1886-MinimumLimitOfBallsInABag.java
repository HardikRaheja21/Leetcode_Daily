// Last updated: 2/10/2026, 3:14:10 PM
class Solution {
    private boolean canAchievePenalty(int[] nums, int maxOperations, int penalty) {
        int operations = 0;
        for (int ball : nums) {
            if (ball > penalty) {
                operations += (ball - 1) / penalty; // Calculate splits required
            }
            if (operations > maxOperations) {
                return false; // Exceeds allowed operations
            }
        }
        return true; // Penalty is achievable
    }
    public int minimumSize(int[] nums, int maxOperations) {
        int left = 1, right = 0;
        for (int num : nums) {
            right = Math.max(right, num); // Find the maximum ball count
        }

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (canAchievePenalty(nums, maxOperations, mid)) {
                right = mid; // Try for a smaller penalty
            } else {
                left = mid + 1; // Increase penalty
            }
        }

        return left; // Minimum achievable penalty
    }
}