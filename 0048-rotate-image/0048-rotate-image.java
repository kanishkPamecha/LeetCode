class Solution {
    public void swap(int [][]matrix , int i , int j )
    {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
    }

     public void transpose(int [][] matrix)
     {
        for(int i =0 ;i<matrix.length ;i++)
        {
            for(int j =i ;j<matrix[0].length ;j++)
            {
                swap(matrix , i ,j);
            }
        }
     }
    public void rotate(int[][] matrix) {
        transpose(matrix);
        for(int i =0 ;i<matrix.length ;i++)
        {
            int j =0; int k = matrix[0].length-1;
            while(j<k)
            {
                int temp = matrix[i][j];
                 matrix[i][j]= matrix[i][k];
                  matrix[i][k] = temp;
                  j++;
                  k--;
            }
        }



    }
}