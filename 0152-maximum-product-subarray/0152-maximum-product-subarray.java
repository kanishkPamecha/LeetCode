class Solution {
    public int maxProduct(int[] nums) {
         
         double maxPro = Integer.MIN_VALUE;
         for(int i =0 ;i< nums.length ;i++)
         { 
            double pro=1;
            for(int j = i ;j<nums.length ;j++)
            {  
                pro  = pro * nums[j];
             if(maxPro<pro && pro<Integer.MAX_VALUE)maxPro=(int)pro;
            }
         }
    return (int) maxPro;
    }
}