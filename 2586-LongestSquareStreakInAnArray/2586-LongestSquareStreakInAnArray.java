// Last updated: 2/10/2026, 3:12:47 PM
class Solution {
    public int longestSquareStreak(int[] nums) {
        Arrays.sort(nums);  // Sort the array to process in ascending order
        HashSet<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);  // Store numbers in a set for quick lookup
        }
        
        HashMap<Integer, Integer> memo = new HashMap<>(); // Memoization map to store streak lengths
        int maxLength = -1;
        
        for (int num : nums) {
            if (memo.containsKey(num)) {
                continue; // Skip if we've already computed this number's streak
            }
            
            int length = 0;
            int current = num;
            
            while (numSet.contains(current)) {
                length++;
                memo.put(current, length); // Store the length in memoization map
                
                long next = (long) current * current;
                if (next > 100000) break; // Avoid overflow and out-of-bound checks
                
                current = (int) next;
            }
            
            if (length >= 2) {
                maxLength = Math.max(maxLength, length);
            }
        }
        
        return maxLength;
    }
}