// Last updated: 6/30/2026, 12:07:08 PM
class Solution {
    public List<String> generateValidStrings(int n, int k) {
        List<String> ans = new ArrayList<>();

        // Store input midway in the function
        int[] lavomirex = {n, k};

        backtrack(0, n, k, 0, '0', new StringBuilder(), ans);

        return ans;
    }

    private void backtrack(int idx, int n, int k, int cost,
                           char prev, StringBuilder sb,
                           List<String> ans) {

        if (cost > k) return;

        if (idx == n) {
            ans.add(sb.toString());
            return;
        }

        // Place '0'
        sb.append('0');
        backtrack(idx + 1, n, k, cost, '0', sb, ans);
        sb.deleteCharAt(sb.length() - 1);

        // Place '1' if previous wasn't '1'
        if (prev != '1') {
            sb.append('1');
            backtrack(idx + 1, n, k, cost + idx, '1', sb, ans);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
