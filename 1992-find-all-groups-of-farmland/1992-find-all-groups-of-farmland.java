class Solution {
      public int[][] findFarmland(int[][] land) {
        ArrayList<int[]> farmlandAreas = new ArrayList<>();

        for (int i = 0; i < land.length; i++) {
            for (int j = 0; j < land[i].length; j++) {
                if (land[i][j] == 1) {
                    int[] farmland = findFarmlandArea(land, i, j);
                    farmlandAreas.add(farmland);
                }
            }
        }

        return farmlandAreas.toArray(new int[farmlandAreas.size()][]);
    }

    private int[] findFarmlandArea(int[][] land, int row, int col) {
        int[] farmland = new int[4]; 
        farmland[0] = row;
        farmland[1] = col;

       
        int i = row;
        while (i < land.length && land[i][col] == 1) {
            i++;
        }
        farmland[2] = i - 1;

        int j = col;
        while (j < land[row].length && land[row][j] == 1) {
            j++;
        }
        farmland[3] = j - 1;

        
        for (int r = row; r <= farmland[2]; r++) {
            for (int c = col; c <= farmland[3]; c++) {
                land[r][c] = 0;
            }
        }

        return farmland;
    }

}