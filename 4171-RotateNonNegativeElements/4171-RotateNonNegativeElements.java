// Last updated: 2/21/2026, 9:40:25 AM
class Solution {
    public int[] rotateElements(int[] nums, int k) {
        int n = nums.length;

        // 1. Count non-negative elements (>= 0)
        int cnt = 0;
        for (int x : nums) {
            if (x >= 0) cnt++;
        }

        // 2. Collect non-negative elements
        int[] arr = new int[cnt];
        int p = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] >= 0) {
                arr[p++] = nums[i];
            }
        }

        // 3. Rotate right
        if (cnt > 0) {
            rotateRight(arr, k);
        }

        // 4. Rebuild answer
        int idx = 0;
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            if (nums[i] < 0) {
                res[i] = nums[i];
            } else {
                res[i] = arr[idx++];
            }
        }

        return res;
    }

    private void rotateRight(int[] arr, int k) {
        int n = arr.length;
        k %= n;

        int[] temp = new int[n];
        for (int i = 0; i < n; i++) {
            temp[(i - k + n) % n] = arr[i];
        }

        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
    }
}