// Last updated: 2/10/2026, 3:11:17 PM
import java.util.*;

public class Solution {
    public int maxFrequency(int[] nums, int k, int numOperations) {
        Map<Integer, Integer> freq = new HashMap<>();
        Map<Integer, Integer> diff = new HashMap<>();

        // Step 1: Count frequency of each number and build diff map
        for (int a : nums) {
            freq.put(a, freq.getOrDefault(a, 0) + 1);
            diff.put(a - k, diff.getOrDefault(a - k, 0) + 1);
            diff.put(a + k + 1, diff.getOrDefault(a + k + 1, 0) - 1);
        }

        // Step 2: Collect all unique keys (possible target values)
        Set<Integer> candidates = new HashSet<>(freq.keySet());
        candidates.addAll(diff.keySet());

        // Step 3: Sweep through sorted keys
        List<Integer> sortedKeys = new ArrayList<>(candidates);
        Collections.sort(sortedKeys);

        int ans = 1;
        int active = 0;

        for (int x : sortedKeys) {
            active += diff.getOrDefault(x, 0);
            int already = freq.getOrDefault(x, 0);
            int modifiable = active - already;
            int current = already + Math.min(numOperations, modifiable);
            ans = Math.max(ans, current);
        }

        return ans;
    }

    // Example test
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums1 = {1, 4, 5};
        System.out.println(sol.maxFrequency(nums1, 1, 2)); // Output: 2

        int[] nums2 = {5, 11, 20, 20};
        System.out.println(sol.maxFrequency(nums2, 5, 1)); // Output: 2
    }
}
