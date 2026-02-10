// Last updated: 2/10/2026, 3:16:36 PM
class Solution {
    public int findLengthOfLCIS(int[] nums) {
        if(nums.length == 0) return 0;

        int maxLength = 1; // To store the maximum length of the increasing subsequence
        int currentLength = 1;  // To store the current length of the increasing subsequence
        
        for(int i = 1; i < nums.length; i++){
            if(nums[i] > nums[i - 1]){
                currentLength++; // Continue increasing the sequence
            }
            else{
                maxLength = Math.max(maxLength, currentLength); // Update maxLength
                currentLength = 1; // Reset the current length for a new sequence
            }

            
        }
        // One final comparison in case the longest subsequence ends at the end of the array
            return Math.max(maxLength, currentLength);
    }
}