// Last updated: 2/13/2026, 7:38:34 AM
class Solution {
        public int[] cycleLengthQueries(int n, int[][] queries) {
        int m = queries.length, res[] = new int[m];
        for (int i = 0; i < m; ++i) {
            res[i]++;
            int x = queries[i][0], y = queries[i][1];
            while (x != y) {
                if (x > y)
                    x /= 2;
                else
                    y /= 2;
                res[i]++;
            }
        }
        return res;
    }
}