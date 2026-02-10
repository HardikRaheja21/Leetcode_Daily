// Last updated: 2/10/2026, 3:14:37 PM
class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        HashMap<Integer, Integer> hs = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(hs.containsKey(nums[i])){
                count += hs.get(nums[i]);
            }
            hs.put(nums[i], hs.getOrDefault(nums[i], 0) + 1);
        }
        return count;
    }
}