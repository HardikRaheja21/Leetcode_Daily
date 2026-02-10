// Last updated: 2/10/2026, 3:18:53 PM
class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> hs = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            hs.put(nums[i], hs.getOrDefault(nums[i], 0) + 1);
        }
        for(int i = 0; i < nums.length; i++){
            if(hs.get(nums[i]) < 3) return nums[i];
        }
        return 0;
    }
}