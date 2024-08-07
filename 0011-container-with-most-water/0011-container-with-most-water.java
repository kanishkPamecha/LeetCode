class Solution {
    public int maxArea(int[] height) {
        
        int i =0 ;
        int j = height.length-1;
        int max =0;

        while(i<j)
        { 
         int min = Math.min(height[i], height[j]);
         int val =   min*(j-i);
             max = Math.max(max, val);
             if(height[i]<= height[j]) i++;
             else  j --;
        }
        
return max;
    }
}