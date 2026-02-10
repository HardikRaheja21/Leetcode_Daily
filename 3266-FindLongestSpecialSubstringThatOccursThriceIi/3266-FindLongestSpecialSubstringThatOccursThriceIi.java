// Last updated: 2/10/2026, 3:11:48 PM
class Solution {
    public int maximumLength(String s) {
        int n = s.length();
        int[][] occ = new int[26][n + 1]; // occ[ch][L] = occurrences of char ch substring length L

        int i = 0;
        while (i < n) {
            int j = i;
            while (j < n && s.charAt(j) == s.charAt(i)) j++;

            int len = j - i;
            int ch = s.charAt(i) - 'a';

            // run length len contributes:
            // length 1 -> len times
            // length 2 -> len-1 times
            // ...
            for (int L = 1; L <= len; L++) {
                occ[ch][L] += (len - L + 1);
            }

            i = j;
        }

        int ans = -1;
        for (int ch = 0; ch < 26; ch++) {
            for (int L = n; L >= 1; L--) {
                if (occ[ch][L] >= 3) {
                    ans = Math.max(ans, L);
                    break;
                }
            }
        }

        return ans;
    }
}
