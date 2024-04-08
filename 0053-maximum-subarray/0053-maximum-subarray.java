class Solution {
    public int maxSubArray(int[] nums) {
      int max_s = Integer.MIN_VALUE;
   int sum = 0;

   for(int i : nums)
   {  sum += i;
    if(max_s<sum)max_s= sum;
    if(sum<0) sum=0;
   }
return max_s;








//         int sum = Integer.MIN_VALUE;
//         if(nums.length==1) return nums[0];
//         int []dp = new int [nums.length+1];
//         dp[1]=nums[0];
//         for(int i =0 ;  i<dp.length ;i++)
//         {
//             for(int j =0 ; j<i ;j++)
//             {
//             sum= Math.max(sum,dp[i]-dp[j]);
//             }
//         }
//  return sum;
    }
}