class Solution {
    public int maxArea(int[] height) {
        
        int i =0 ;
        int max =0;
        int j = height.length-1;
        while(i<=j)
        {
            int x = Math.min(height[i] ,height[j]);
            int a = (j-i)*x;
       if(height[i]<height[j]){
 i++;

       }
       else 
       {
          j--;
       }
      if(a>max){max=a;}
        }
return max;
    }
}