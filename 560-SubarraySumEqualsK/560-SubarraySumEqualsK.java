// Last updated: 2/10/2026, 3:16:45 PM
class Solution {
    public int subarraySum(int[] nums, int k) {
        int sum = 0;
        int count = 0;
        Map<Integer, Integer> hs = new HashMap<>();
        hs.put(0, 1);
        for(int num : nums){
            sum += num;
            count += hs.getOrDefault(sum - k, 0);
            hs.put(sum, hs.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}