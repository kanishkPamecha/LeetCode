class Solution {
    public int matrixScore(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        for (int i = 0; i < rows; i++) {
            if (grid[i][0] == 0) {
                for (int j = 0; j < cols; j++) {
                    grid[i][j] = 1 - grid[i][j];
                }
            }}     
        for (int j = 1; j < cols; j++) {
            int count1 = 0;
            for (int i = 0; i < rows; i++) {
                count1 += grid[i][j];
            }
         
            if (count1 < (rows + 1) / 2) {
                for (int i = 0; i < rows; i++) {
                    grid[i][j] = 1 - grid[i][j];
                }
            }
        }    
        int score = 0;
        for (int i = 0; i < rows; i++) {
            int rowVal = 0;
            for (int j = 0; j < cols; j++) {
                rowVal = (rowVal << 1) | grid[i][j];
            }
            score += rowVal;
        }
        
        return score;
    }
}
