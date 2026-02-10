// Last updated: 2/10/2026, 3:13:06 PM
class Solution {
    public int[] numberOfPairs(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        for(int num : nums){
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        int pairs = 0;
        int singles = 0;
        for(Map.Entry<Integer, Integer> entry : freq.entrySet()){
            int count = entry.getValue();
            pairs += count / 2;
            singles += count % 2;
        }
        int[] result = {pairs, singles};
        return result;
    }
}