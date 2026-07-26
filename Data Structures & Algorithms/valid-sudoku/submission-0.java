class Solution {
    public boolean helper(char[][] board,int row,int col){
        int startRow = (row / 3) * 3;
        int startCol = (col / 3) * 3;
        for(int i = col+1;i<9;i++){
            if(board[row][col] == board[row][i]){
                return false;
            }
        }
        for(int i = row+1;i<9;i++){
            if(board[row][col] == board[i][col] ){
                return false;
            }
        }
        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                if ((i != row || j != col) && board[i][j] == board[row][col]) {
                    return false;
                }
            }
        }
        return true;
    }


    public boolean isValidSudoku(char[][] board) {
        for(int i = 0;i<9;i++){
            for(int j = 0; j<9 ;j++){
                if(board[i][j] == '.'){
                    continue;
                }
                
                if (!helper(board, i, j)) {
                    return false;
                }
            }
        }
        return true;
    }

}
