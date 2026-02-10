// Last updated: 2/10/2026, 3:20:07 PM
class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);  // Sort to handle duplicates
        boolean[] used = new boolean[nums.length];  // Track used elements
        backtrack(nums, new ArrayList<>(), used, result);
        return result;
    }

    private void backtrack(int[] nums, List<Integer> current, boolean[] used, List<List<Integer>> result) {
        // Base case: if current permutation has the same size as nums, add it to result
        if (current.size() == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        // Iterate through the numbers
        for (int i = 0; i < nums.length; i++) {
            // Skip duplicate elements or elements already used in the current permutation
            if (used[i] || (i > 0 && nums[i] == nums[i - 1] && !used[i - 1])) {
                continue;
            }

            // Include nums[i] in the current permutation
            used[i] = true;
            current.add(nums[i]);

            // Recurse
            backtrack(nums, current, used, result);

            // Backtrack: remove the last element and mark it as unused
            used[i] = false;
            current.remove(current.size() - 1);
        }
    }
}