class Solution {
    public int robb (int []nums,int []dp,int id){
        if(id>=nums.length){return 0;}
        if(id==nums.length-1){
            return nums[id];
        }
        if(dp[id]!=-1){return dp[id];}
        int combine = nums[id]+robb(nums,dp,id+2);
        int notcombine = robb(nums,dp,id+1);
        return dp[id]=Math.max(combine,notcombine);
    }
    public int rob(int[] nums) {
        int []dp= new int [nums.length];
        for(int i=0;i<nums.length;i++)
        {
            dp[i]=-1;
        }
        return robb(nums,dp,0);
    }
}