// Last updated: 2/10/2026, 3:16:56 PM
class Solution {
    private void subSequence(int idx, int[] nums, List<List<Integer>> ans, List<Integer> ds){
        if(ds.size() >= 2){
            ans.add(new ArrayList<>(ds));
        }
        HashSet<Integer> used = new HashSet<>();

        for(int i = idx; i < nums.length; i++){
            if(used.contains(nums[i])) continue;
            if(ds.size() == 0 || nums[i] >= ds.get(ds.size() - 1)){
                used.add(nums[i]);
                ds.add(nums[i]);
                subSequence(i + 1, nums, ans, ds);
                ds.remove(ds.size() - 1);
            }
        }
    }
    public List<List<Integer>> findSubsequences(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        subSequence(0, nums, ans, new ArrayList<>());
        return ans;
    }
}