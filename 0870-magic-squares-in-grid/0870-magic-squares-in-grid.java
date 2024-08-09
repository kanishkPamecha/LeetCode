class Solution {
    public int numMagicSquaresInside(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int count = 0;

        for(int i = 0; i <= n - 3; i++){
            for(int j = 0; j <= m - 3; j++){
                if(isMagic(i, j, grid)){
                    count++;
                }
            }
        }
        return count;
    }

    public boolean isMagic(int row, int col, int[][] grid){
        boolean nums[] = new boolean[10];
        int rowSum[] = new int[3];
        int colSum[] = new int[3];

        for(int i = row; i < row + 3; i++){
            for(int j = col; j < col + 3; j++){
                rowSum[i - row] += grid[i][j];
                colSum[j - col] += grid[i][j];
                if(grid[i][j] < 1 || grid[i][j] > 9 || nums[grid[i][j]] == true){
                    return false;
                }
                nums[grid[i][j]] = true;
            }
        }

        int sum = 0;
        for(int i = col; i < col + 3; i++){
            sum += grid[row][i];
        }

        for(int i = 0; i < 3; i++){
            if(rowSum[i] != sum || colSum[i] != sum){
                return false;
            }
        }

        int diagSum1 = grid[row][col] + grid[row + 1][col + 1] + grid[row + 2][col + 2];
        if(diagSum1 != sum) return false;

        int diagSum2 = grid[row][col + 2] + grid[row + 1][col + 1] + grid[row + 2][col];
        if(diagSum2 != sum) return false;

        return true;
        

    }
}