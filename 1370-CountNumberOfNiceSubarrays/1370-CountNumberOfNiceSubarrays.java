// Last updated: 2/10/2026, 3:15:03 PM
class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return atMost(nums, k) - atMost(nums, k - 1);
    }
    public int atMost(int[] nums, int k){
        if(k < 0) return 0;
        int left = 0, right = 0, count = 0, odd = 0;
        while(right < nums.length){
            if(nums[right] % 2 != 0) odd++;
            while(odd > k){
                if(nums[left] % 2 != 0) odd--;
                left++;
            }
            count += right - left + 1;
            right++;
        }
        return count;
    }
}