class Solution {
    public int trap(int[] height) {
    int [] l = new int[height.length];
    int [] r = new int [height.length];
       int max =0 ;
       int sum=0;
    for(int i = 0 ; i<height.length ;i++ )
    {
        l[i]=max;
        if(height[i]>max) max=height[i];
    } 
    max=0;
    for(int i = height.length-1 ; i>0 ;i-- )
    {
        r[i]=max;
        if(height[i]>max) max=height[i];
    }
    for(int i =0 ;i< height.length ;i++)
    {
        int a = Math.min(l[i],r[i]);
        if(a-height[i]>=0) 
        {
            sum+=(a-height[i]);
        }
    }
        return sum;
        
        
         


    }
}