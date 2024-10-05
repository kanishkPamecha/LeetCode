class Solution {
    public int threeSumClosest(int[] nums, int target) {
      int   sum = Integer.MAX_VALUE;
    int n = nums.length;
       for(int i =0;i<n ;i++)
       {
        for(int j =i+1;j<n ;j++)
        {
            for(int k =j+1; k<n;k++)
            {
               if(Math.abs(target-sum) > Math.abs(target-(nums[i]+nums[j]+nums[k])))
               {
                sum = nums[i]+nums[j]+nums[k];
               }
            }
        }
       }
return sum;
    }
}