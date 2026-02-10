// Last updated: 2/10/2026, 3:14:28 PM
class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int low = 0, high = position[position.length - 1] - position[0], ans = 0;
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(canBePlaced(position, mid, m)) {
                ans = mid;
                low = mid + 1;
            } else high = mid - 1;
        }
        return ans;
    }
    public boolean canBePlaced(int[] position, int dist, int m){
        int cutBalls = 1, last = position[0];
        for(int i = 0; i < position.length; i++){
            if(position[i] - last >= dist){
                cutBalls++;
                last = position[i];
            }
            if(cutBalls >= m) return true;
        }
        return false;
    }
}