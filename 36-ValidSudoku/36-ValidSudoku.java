// Last updated: 2/10/2026, 3:20:17 PM
class Solution {
    public boolean isValidSudoku(char[][] board) {
        //rows
        for(int i = 0; i < 9; i++){
            Set<Character> hs = new HashSet<>();
            for(int j = 0; j < 9; j++){
                if(board[i][j] != '.'){
                    if(hs.contains(board[i][j])) return false;
                    else hs.add(board[i][j]);
                }
            }
        }
        
        //columns 
        for(int i = 0; i < 9; i++){
            Set<Character> hs = new HashSet<>();
            for(int j = 0; j < 9; j++){
                if(board[j][i] != '.'){
                    if(hs.contains(board[j][i])) return false;
                    else hs.add(board[j][i]);
                }
            }
        }

        //subbox
        for(int boxRow = 0; boxRow < 3; boxRow++){
            for(int boxCol = 0; boxCol < 3; boxCol++){
                Set<Character> hs = new HashSet<>();
                for(int i = 0; i < 3; i++){
                    for(int j = 0; j < 3; j++){
                        int row = boxRow * 3 + i;
                        int col = boxCol * 3 + j;
                        if(board[row][col] != '.'){
                            if(hs.contains(board[row][col])) return false;
                            else hs.add(board[row][col]);
                        }
                    }
                }
            }
        }
        return true;
    }
}