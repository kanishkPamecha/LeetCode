class Solution {
    public boolean isValidSudoku(char[][] board) {
          boolean a = true;
        for(int i =0;i<board.length;i++)
        {
            for(int j =0 ;j<board[0].length ;j++)
            {
                if(board[i][j]!='.'){
                 a =a & check( board ,  i , j );
                }

            }
        }
        return a ;
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