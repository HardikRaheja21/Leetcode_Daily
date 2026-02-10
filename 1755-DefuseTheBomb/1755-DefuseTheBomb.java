// Last updated: 2/10/2026, 3:14:25 PM
class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] result = new int[n];

        if (k == 0) {
            // If k == 0, all elements become 0
            Arrays.fill(result, 0);
            return result;
        }

        // Determine direction and range based on k
        int start = k > 0 ? 1 : k; // Start from next element if k > 0, or `k` if k < 0
        int end = k > 0 ? k : -1;  // End at k if k > 0, or previous element (-1) if k < 0

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = start; j <= end; j++) {
                // Compute the circular index
                int idx = (i + j + n) % n;
                sum += code[idx];
            }
            result[i] = sum;
        }
        return result;
    }
}