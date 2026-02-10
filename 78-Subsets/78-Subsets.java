// Last updated: 2/10/2026, 3:19:32 PM
class Solution {
    private void subsets(int idx, int[] nums, List<List<Integer>> ans, List<Integer> ds){
        if(idx == nums.length){
            ans.add(new ArrayList<>(ds));
            return;
        }
        ds.add(nums[idx]);
        subsets(idx + 1, nums, ans, ds);

        ds.remove(ds.size() - 1);
        subsets(idx + 1, nums, ans, ds);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        subsets(0, nums,ans, new ArrayList<>());
        return ans;
    }
}