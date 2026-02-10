// Last updated: 2/10/2026, 3:15:41 PM
class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] squareArray = new int[nums.length];

        for(int i = 0; i < nums.length; i++){
            squareArray[i] = nums[i] * nums[i];
        }
        Arrays.sort(squareArray);
        return squareArray;
    }
}