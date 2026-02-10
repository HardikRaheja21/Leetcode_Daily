// Last updated: 2/10/2026, 3:20:05 PM
class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        //Transposing the Matrix
        for(int i = 0; i < matrix.length; i++){
            for(int j = i + 1; j < matrix[i].length; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        //Reversing the Matrix
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n / 2; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n - j - 1];
                matrix[i][n - j - 1] = temp;
            }
        }
    }
}