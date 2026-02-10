// Last updated: 2/10/2026, 3:19:37 PM
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        //LINEAR SEARCH
        // for(int i = 0; i < matrix.length; i++){
        //     for(int j = 0; j < matrix[i].length; j++){
        //         if(matrix[i][j] == target) return true;
        //     }
        // }
        // return false;

        //BINARY SEARCH
        int m = matrix.length, n = matrix[0].length;
        int left = 0, right = m * n - 1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            int value = matrix[mid / n][mid % n];
            if(value == target) return true;
            else if(value < target) left = mid + 1;
            else right = mid - 1;
        }
        return false;
    }
}