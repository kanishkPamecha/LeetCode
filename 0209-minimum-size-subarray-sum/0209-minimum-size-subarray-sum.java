class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        

            int sum =0;
            int min =Integer.MAX_VALUE;
                  int i =0 ;
                  int j =0;
                 int n = nums.length;
           while(i<n)
           {
             sum+=nums[i];
             while(sum>=target)
             {

                 min = Math.min(min,i-j+1);
                 sum-=nums[j++];
                  
             }
             i++;

           }    
           if(min == Integer.MAX_VALUE)return 0;  
             return min;
    }
}