// Last updated: 2/10/2026, 3:11:52 PM
class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1);
        }
        int max = 0;
        int numOfMax = 0;
        for(Integer key : freq.keySet()){
            if(freq.get(key) > max){
                max = freq.get(key);
                numOfMax = 1;
            } else if(freq.get(key) == max) numOfMax++;
        }
        return max * numOfMax;
    }
}