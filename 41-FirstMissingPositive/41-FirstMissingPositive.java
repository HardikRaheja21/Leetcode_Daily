// Last updated: 2/10/2026, 3:20:12 PM
class Solution {
    public int firstMissingPositive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            set.add(nums[i]);
        }
        int num = 1;
        int max = Integer.MAX_VALUE;
        for(int i = 0; i < num + 1; i++){
            if(!set.contains(num)) return num;
            else num++;
        }
        return num;
    }
}