// Last updated: 2/19/2026, 12:05:07 PM
class Solution {
    public int firstUniqueFreq(int[] nums) {
        HashMap<Integer, Integer> freqOfNum = new HashMap<>();
        HashMap<Integer, Integer> freqOfFreq = new HashMap<>();
        // Step 1: frequency of numbers
        for (int num : nums) {
            freqOfNum.put(num, freqOfNum.getOrDefault(num, 0) + 1);
        }

        // Step 2: frequency of frequencies
        for (int freq : freqOfNum.values()) {
            freqOfFreq.put(freq, freqOfFreq.getOrDefault(freq, 0) + 1);
        }
        for(int num : nums){
            int freq = freqOfNum.get(num);
            if(freqOfFreq.get(freq) == 1) return num;
        }
        return -1;
    }
}