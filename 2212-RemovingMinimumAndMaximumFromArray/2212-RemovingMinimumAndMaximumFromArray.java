// Last updated: 2/10/2026, 3:13:36 PM
class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        // indices of min and max
        int minIdx = 0, maxIdx = 0;

        // find both indices in one pass (use separate ifs, not else-if)
        for (int i = 0; i < n; i++) {
            if (nums[i] < nums[minIdx]) minIdx = i;
            if (nums[i] > nums[maxIdx]) maxIdx = i;
        }

        // make minIdx < maxIdx to simplify reasoning (optional)
        if (minIdx > maxIdx) {
            int t = minIdx;
            minIdx = maxIdx;
            maxIdx = t;
        }

        // 3 choices:
        // 1) Remove both from front: remove up to maxIdx -> maxIdx + 1
        // 2) Remove both from back: remove from end up to minIdx -> n - minIdx
        // 3) Remove one from front and one from back: (minIdx + 1) + (n - maxIdx)
        int removeFrontBoth = maxIdx + 1;
        int removeBackBoth  = n - minIdx;
        int removeMix       = (minIdx + 1) + (n - maxIdx);

        return Math.min(removeFrontBoth, Math.min(removeBackBoth, removeMix));
    }
}
