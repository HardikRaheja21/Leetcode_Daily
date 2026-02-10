// Last updated: 2/10/2026, 3:17:28 PM
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[k];
        Map<Integer, Integer> freq = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1);
        }
        List<Integer>[] buckets = new ArrayList[nums.length + 1];
        for(int key : freq.keySet()){
            int val = freq.get(key);
            if(buckets[val] == null) buckets[val] = new ArrayList<>();
            buckets[val].add(key); 
        }
        int idx = 0;
        for(int i = buckets.length - 1; i >= 0 && idx < k; i--){
            if(buckets[i] != null){
                for(int num : buckets[i]){
                    result[idx++] = num;
                    if(idx == k) break;
                }
            }
        }
        return result;
    }
}