// Last updated: 2/10/2026, 3:11:39 PM
class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for(int num : nums){
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        } 
        int xor = 0;
        for(Map.Entry<Integer, Integer> entry : freq.entrySet()){
            if(entry.getValue() == 2){
                xor ^= entry.getKey();
            }
        }
        return xor;
    }
}