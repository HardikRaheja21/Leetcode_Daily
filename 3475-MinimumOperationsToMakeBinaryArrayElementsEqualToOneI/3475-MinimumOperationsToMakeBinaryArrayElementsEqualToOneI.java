// Last updated: 2/10/2026, 3:11:36 PM
class Solution {
    private void flip(int[] nums, int idx){
        if(nums[idx] == 0) nums[idx] = 1;
        else nums[idx] = 0;
    }
    private boolean containsZero(int[] nums){
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0) return false;
        }
        return true;
    }
    public int minOperations(int[] nums) {
        int cnt = 0;
        int i = 0;
        while(i < nums.length - 2){
            if(nums[i] == 0){
                flip(nums, i);
                flip(nums, i + 1);
                flip(nums, i + 2);
                cnt++;
            }
            i++;
        }
        if(!containsZero(nums)) return -1;
        return cnt;
    }
}