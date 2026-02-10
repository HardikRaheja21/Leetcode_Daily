// Last updated: 2/10/2026, 3:12:23 PM
class Solution {
    private int minOfWindow(int[] freq, int x){
        int count = 0;
        for(int i = 0; i < 50; i++){
            count += freq[i];
            if(count >= x) return i - 50;
        }
        return 0;
    }
    public int[] getSubarrayBeauty(int[] nums, int k, int x) {
        int n = nums.length;
        int[] result = new int[n - k + 1];
        int[] freq = new int[101];
        for(int i = 0; i < k; i++){
            freq[nums[i] + 50]++;
        }
        int idx = 0;
        result[idx++] = minOfWindow(freq, x);
        for(int i = k; i < n; i++){
            freq[nums[i] + 50]++;
            freq[nums[i - k] + 50]--;
            result[idx++] = minOfWindow(freq, x);
        }
        return result;
    }
}