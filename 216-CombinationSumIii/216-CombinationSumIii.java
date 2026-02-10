// Last updated: 2/10/2026, 3:18:10 PM
class Solution {
    private void combinations(int k, int cnt, int n, int num, List<List<Integer>> ans, List<Integer> ds){
        if(cnt == k && n == 0){
            ans.add(new ArrayList<>(ds));
            return;
        }
        if(cnt > k || n < 0) return;
        for(int i = num; i <= 9; i++){
            if(i <= n){
                ds.add(i);
                combinations(k, cnt + 1, n - i, i + 1, ans, ds);
                ds.remove(ds.size() - 1);
            }
        }
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        combinations(k, 0, n, 1, ans, new ArrayList<>());
        return ans;
    }
}