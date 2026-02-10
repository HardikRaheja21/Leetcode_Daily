// Last updated: 2/10/2026, 3:14:51 PM
class Solution {
    public int numTeams(int[] rating) {
        int n = rating.length;
        int ans = 0;

        for (int j = 0; j < n; j++) {
            int leftSmaller = 0, leftGreater = 0;
            int rightSmaller = 0, rightGreater = 0;

            for (int i = 0; i < j; i++) {
                if (rating[i] < rating[j]) leftSmaller++;
                else if (rating[i] > rating[j]) leftGreater++;
            }

            for (int k = j + 1; k < n; k++) {
                if (rating[k] > rating[j]) rightGreater++;
                else if (rating[k] < rating[j]) rightSmaller++;
            }

            ans += leftSmaller * rightGreater;
            ans += leftGreater * rightSmaller;
        }

        return ans;
    }
}