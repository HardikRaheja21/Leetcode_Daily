// Last updated: 2/10/2026, 3:15:53 PM
class Solution {
    Random rand = new Random();
    public int[] sortArray(int[] nums) {
        quicksort(nums, 0, nums.length - 1);
        return nums;
    }
    public void quicksort(int[] nums, int left, int right){
        if(left >= right) return;
        int pivotIndex = left + rand.nextInt(right - left + 1);
        int pivot = nums[pivotIndex];
        int i = left, j = right;
        while(i <= j){
            while(nums[i] < pivot) i++;
            while(nums[j] > pivot) j--;
            if(i <= j){
                swap(nums, i, j);
                i++;
                j--;
            }
        }
        quicksort(nums, left, j);
        quicksort(nums, i, right);
    }
    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}