// Last updated: 2/10/2026, 3:11:21 PM
class Solution {
    public List<Integer> stableMountains(int[] height, int threshold) {
        List<Integer> result = new ArrayList<>();
        for(int i = 1; i < height.length; i++){
            if(height[i - 1] > threshold){
                result.add(i);
            }
        }
        return result;
    }
}