// Last updated: 2/10/2026, 3:17:50 PM
class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer, Integer> hs = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            hs.put(nums[i], hs.getOrDefault(nums[i], 0) + 1);
        }
        int[] result = new int[2];
        int idx = 0;
        for(int i = 0; i < nums.length; i++){
            if(hs.get(nums[i]) < 2) result[idx++] = nums[i];
        }
        return result;
    }
}