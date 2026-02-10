// Last updated: 2/10/2026, 3:19:33 PM
class Solution {
    private void combinations(int start, int n, int k, List<List<Integer>> ans, List<Integer> ds){
        if(ds.size() == k){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i = start; i <= n; i++){
            ds.add(i);
            combinations(i + 1, n, k, ans, ds);
            ds.remove(ds.size() - 1);
        }
    }
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        combinations(1, n, k, ans, new ArrayList<>());
        return ans;
    }
}