class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
          List <Integer> n1 = new ArrayList(); 
          int count = 0;
          int i  = matrix.length;
          int k = matrix[0].length;
         int toprow = 0, bottomr = i-1, leftc = 0, rightc = k-1;

       while(count < i*k) {
           // toprow ->leftc to rightc
           for (int j = leftc; j <=rightc && count < i*k ; j++) {
             n1.add(matrix[toprow][j]);
               count ++ ;
           }
             toprow++;
           // rightc -> toproe to bottomr
           for (int j = toprow; j <=bottomr  && count < i*k; j++) {
              n1.add( matrix[j][rightc] );
               count ++ ;

           }
               rightc --;
         //  bottomr -> right to left
           for (int j = rightc; j >=leftc  &&  count < i*k; j--) {
               n1.add( matrix[bottomr][j] );
               count ++ ;

           }
              bottomr --;
              // leftc -> bottom to top
           for (int j = bottomr; j >=toprow && count < i*k ; j--) {
              n1.add( matrix[j][leftc]);
               count ++ ;

           }
              leftc ++;



       

}
return n1;
    }
}