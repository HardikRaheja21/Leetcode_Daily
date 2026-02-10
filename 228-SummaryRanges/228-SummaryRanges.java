// Last updated: 2/10/2026, 3:18:05 PM
class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return result;
        }

        int start = 0;
        for(int i = 1; i <= nums.length; i++){
            // Check if we are at the end of the array or if nums[i] is not consecutive with nums[i-1]
            if(i == nums.length || nums[i] != nums[i - 1] + 1){
                // If start == i - 1, we have a single element range4
                if(start == i - 1) {
                    result.add(String.valueOf(nums[start]));
                } else {
                    result.add(nums[start] + "->" + nums[i - 1]);
                }
                //Start a new Range
                start = i;
            }
        }
        return result;
    }
}