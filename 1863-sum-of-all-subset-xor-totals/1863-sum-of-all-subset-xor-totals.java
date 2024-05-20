class Solution { 
    public int subseq(int []nums, int idx , int xor)
    {
        if(idx == nums.length)return xor;
        int take = subseq( nums, idx+1 ,nums[idx] ^ xor );
        int notake = subseq(nums, idx+1 ,xor);
 return take+ notake;
    }
    public int subsetXORSum(int[] nums) { 
        int x=0;
          return subseq(nums,0,x);
        
    }
}