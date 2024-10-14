class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
    int n1 = matrix.length;
    int n2 = matrix[0].length;
int l =0;
int h =n1*n2 -1;

     while(l<=h)
     {
        int mid = l + (h-l)/2;
        int a = mid/n2;
        int b =mid%n2;
        if(matrix[a][b]==target) return true;
        if(target> matrix[a][b]) l = mid+1;
        else h = mid-1;
     }
return false;
    
    }

}