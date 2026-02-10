// Last updated: 2/10/2026, 3:16:55 PM
class Solution {
    public int[] constructRectangle(int area) {
        int[] ans = new int[2];

        int width = (int)Math.sqrt(area);

        while (area % width != 0){
            width--;
        }

        int length = area/width;

        ans[0] = length;
        ans[1] = width;

        return ans;
    }
}