// Last updated: 2/19/2026, 12:04:51 PM
1class Solution {
2    public int firstUniqueFreq(int[] nums) {
3        HashMap<Integer, Integer> freqOfNum = new HashMap<>();
4        HashMap<Integer, Integer> freqOfFreq = new HashMap<>();
5        // Step 1: frequency of numbers
6        for (int num : nums) {
7            freqOfNum.put(num, freqOfNum.getOrDefault(num, 0) + 1);
8        }
9
10        // Step 2: frequency of frequencies
11        for (int freq : freqOfNum.values()) {
12            freqOfFreq.put(freq, freqOfFreq.getOrDefault(freq, 0) + 1);
13        }
14        for(int num : nums){
15            int freq = freqOfNum.get(num);
16            if(freqOfFreq.get(freq) == 1) return num;
17        }
18        return -1;
19    }
20}