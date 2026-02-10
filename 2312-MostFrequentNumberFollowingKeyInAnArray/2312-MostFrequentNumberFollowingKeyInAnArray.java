// Last updated: 2/10/2026, 3:13:23 PM
class Solution {
    public int mostFrequent(int[] nums, int key) {
        HashMap<Integer, Integer> maxFreqTraget = new HashMap<>();
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] == key){
                maxFreqTraget.put(nums[i + 1], maxFreqTraget.getOrDefault(nums[i + 1], 0) + 1);
            }
        }
        int target = 0;
        int maxFreq = 0;
        for(Map.Entry<Integer, Integer> entry : maxFreqTraget.entrySet()){
            if(entry.getValue() > maxFreq){
                maxFreq = entry.getValue();
                target = entry.getKey();
            }
        }
        return target;
    }
}