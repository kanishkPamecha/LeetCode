class Solution {
    public int lengthOfLIS(int[] nums) {
         int max= 0; 
         int [] dp = new int [nums.length];
         Arrays.fill(dp,1);
         int a =0;
   for(int i =0 ; i< nums.length ;i++)
   {
    for(int j = i ; j>=0 ;j--)
    {
        if(nums[j]<nums[i]){
             a = dp[j]+1;   
             dp[i] = Math.max(dp[i], a);
        }
     }
max = Math.max(max,dp[i]);
   }
  return max;

    }
}