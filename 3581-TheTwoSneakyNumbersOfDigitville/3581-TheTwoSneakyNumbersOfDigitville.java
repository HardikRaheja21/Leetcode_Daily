// Last updated: 2/10/2026, 3:11:23 PM
class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        HashMap<Integer, Integer> detector = new HashMap<>();
        int[] result = new int[2];
        int index = 0;
        for(int i = 0; i < nums.length; i++){
            if(detector.containsKey(nums[i])){
                result[index++] = nums[i];
            } else {
                detector.put(nums[i], i);
            }
        }
        return result;
    }
}