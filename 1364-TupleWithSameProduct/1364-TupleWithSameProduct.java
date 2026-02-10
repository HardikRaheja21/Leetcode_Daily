// Last updated: 2/10/2026, 3:15:05 PM
class Solution {
    public int tupleSameProduct(int[] nums) {
        int result = 0;
        Map<Integer, Integer> count = new HashMap<>();
        
        for (int i = 0; i < nums.length; ++i) {
            for (int j = 0; j < i; ++j) {
                int prod = nums[i] * nums[j];
                result += count.getOrDefault(prod, 0) * 8;
                count.put(prod, count.getOrDefault(prod, 0) + 1);
            }
        }
        
        return result;
    }
}
