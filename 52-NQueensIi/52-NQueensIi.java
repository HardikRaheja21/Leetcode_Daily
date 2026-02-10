// Last updated: 2/10/2026, 3:20:00 PM
class Solution {
    private boolean isSafe(int row, int col, char[][] board, int n){
        int dupRow = row;
        int dupCol = col;

        while(row >= 0 && col >= 0){
            if(board[row][col] == 'Q') return false;
            row--;
            col--;
        }
        row = dupRow;
        col = dupCol;
        while(col >= 0){
            if(board[row][col] == 'Q') return false;
            col--;
        }
        row = dupRow;
        col = dupCol;
        while(row < n && col >= 0){
            if(board[row][col] == 'Q') return false;
            row++;
            col--;
        }
        return true;
    }
    private int solve(int col, char[][] board, int n){
        if(col == n){
            return 1;
        }
        int count = 0;
        for(int row = 0; row < n; row++){
            if(isSafe(row, col, board, n)){
                board[row][col] = 'Q';
                count += solve(col + 1, board, n);
                board[row][col] = '.';
            }
        }
        return count;
    }
    public int totalNQueens(int n) {
        char[][] board = new char[n][n];
        for(int i = 0; i < n; i++){
            Arrays.fill(board[i], '.');
        }
        return solve(0, board, n);
    }
}