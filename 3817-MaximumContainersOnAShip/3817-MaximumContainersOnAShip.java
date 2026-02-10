// Last updated: 2/10/2026, 3:11:03 PM
class Solution {
    public int maxContainers(int n, int w, int maxWeight) {
        return Math.min(n * n, maxWeight / w);
    }
}