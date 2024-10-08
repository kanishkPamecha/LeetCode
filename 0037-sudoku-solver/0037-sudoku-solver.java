class Solution {
    public void solveSudoku(char[][] board) {
        solve(board, 0, 0);
    }

    public boolean solve(char[][] board, int i, int j) {
        if (j == 9) {
            j = 0;
            i++;
        }
        if (i == 9) return true;

        if (board[i][j] != '.') {
            return solve(board, i, j + 1);
        }

        for (int k = 1; k <= 9; k++) {
            board[i][j] = (char) (k + '0');
            if (check(board, i, j)) {
                if (solve(board, i, j + 1)) {
                    return true;
                }
            }
            board[i][j] = '.';
        }
        return false;
    }
      public boolean check(char[][]board, int i , int j )
    {
        // row check
        for(int a = 0;a<board.length ;a++)
        {  if(j==a) continue;
                  if(board[i][j]== board[i][a]) return false;
        }
        // column check
         for(int a = 0;a<board.length ;a++)
        {  if(i==a) continue;
             if(board[i][j]== board[a][j]) return false;
        }
        // block check
         int c = i/3;
         c *=3;
         int d  = j/3;
         d = 3*d;
         for(int a =0;a<3;a++)
         {
            for(int b = 0;b<3;b++)
            {
                if(c+a == i && d+b==j) continue;
                if(board[c+a][d+b]== board[i][j]) return false;
            }
         }
         return true;
    }
    
}
