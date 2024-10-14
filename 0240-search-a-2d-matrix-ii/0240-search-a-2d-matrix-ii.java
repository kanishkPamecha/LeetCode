class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

       int n1 = matrix.length;
       int n2 = matrix[0].length;

       int i =0;
       int j= n2-1;

       while(i>=0 && j>=0 && i<n1 && j<n2)
       {
         if(matrix[i][j]==target) return true;
         if(matrix[i][j]>target) j--;
         else i++;
       }
       return false;


    }
}