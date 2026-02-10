// Last updated: 2/10/2026, 3:09:57 PM
class Solution {
    public long numGoodSubarrays(int[] nums, int k) {
        Map<Integer, Long> cnt = new HashMap<>();
        cnt.put(0, 1L);
        int pre = 0, n = nums.length;
        long res = 0;
        for(int num : nums){
            pre = (pre + num) % k;
            res += cnt.getOrDefault(pre, 0L);
            cnt.put(pre, cnt.getOrDefault(pre, 0L) + 1L);
        }
        for(int i = 0; i < n;){
            int j = i;
            while(j < n && nums[j] == nums[i]) ++j;
            int l = j - i;
            for(int ll = 1; ll < l; ++ll){
                if((1L * ll * nums[i]) % k == 0){
                    res -= (l - ll);
                }
            }
            i = j;
        }
        return res;
    }
}