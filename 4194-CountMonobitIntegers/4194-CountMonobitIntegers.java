// Last updated: 2/10/2026, 3:09:40 PM
class Solution {
    public int countMonobit(int n) {
        int count = 1; // counting 0
        
        int val = 1; // 2^1 - 1 = 1
        while (val <= n) {
            count++;
            val = (val << 1) | 1; // generates 1, 3, 7, 15...
        }
        
        return count;
    }
}