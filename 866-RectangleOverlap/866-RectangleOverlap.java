// Last updated: 2/10/2026, 3:16:10 PM
class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        int overlap_width = Math.max(0, Math.min(rec1[2] , rec2[2]) - Math.max(rec1[0] , rec2[0]));
        int overlap_height = Math.max(0, Math.min(rec1[3] , rec2[3]) - Math.max(rec1[1] , rec2[1]));

        return overlap_width > 0 && overlap_height > 0;

        // int overlap_area = overlap_width * overlap_height;

        // if(overlap_area > 0){
        //     return true;
        // }
        // else{
        //     return false;
        // }
    }
}