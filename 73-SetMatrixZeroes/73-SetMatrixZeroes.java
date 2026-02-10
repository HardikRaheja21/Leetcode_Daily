// Last updated: 2/10/2026, 3:19:38 PM
class Solution {
    public void setZeroes(int[][] matrix) {
        Set<Integer> zeroRow = new HashSet<>();
        Set<Integer> zeroCol = new HashSet<>();

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(matrix[i][j] == 0){
                    zeroRow.add(i);
                    zeroCol.add(j);
                }
            }
        }
        for(int row : zeroRow){
            for(int j = 0; j < matrix[0].length; j++){
                matrix[row][j] = 0;
            }
        }
        for(int col : zeroCol){
            for(int i = 0; i < matrix.length; i++){
                matrix[i][col] = 0;
            }
        }
    }
}