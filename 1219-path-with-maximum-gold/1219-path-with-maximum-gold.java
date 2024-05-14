class Solution {
    public int fn(int id, int col, int[][] grid, boolean[][] visited) {
        int rows = grid.length;
        int cols = grid[0].length;
        if (id < 0 || id >= rows || col < 0 || col >= cols || visited[id][col] || grid[id][col] == 0) {
            return 0;
        }
        
     
        visited[id][col] = true;
        
        int up = fn(id - 1, col, grid, visited);
        int down = fn(id + 1, col, grid, visited);
        int left = fn(id, col - 1, grid, visited);
        int right = fn(id, col + 1, grid, visited);
        visited[id][col] = false;
        
        return grid[id][col] + Math.max(Math.max(up, down), Math.max(left, right));
    }
    
    public int getMaximumGold(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int maxGold = 0;
        
        boolean[][] visited = new boolean[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] != 0) {
                    maxGold = Math.max(maxGold, fn(i, j, grid, visited));
                }
            }
        }
        
        return maxGold;
    }
}
