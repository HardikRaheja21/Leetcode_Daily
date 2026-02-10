// Last updated: 2/10/2026, 3:20:08 PM
class Solution {
    private void findPermutation(int[] nums, List<List<Integer>> ans, int idx){
        if(idx == nums.length){
            List<Integer> ds = new ArrayList<>();
            for(int i = 0; i < nums.length; i++){
                ds.add(nums[i]);
            }
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i = idx; i < nums.length; i++){
            swap(i, idx, nums);
            findPermutation(nums, ans, idx + 1);
            swap(i, idx, nums);
        }
    }
    private void swap(int i, int j, int[] nums){
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        findPermutation(nums, ans, 0);
        return ans;
    }
}