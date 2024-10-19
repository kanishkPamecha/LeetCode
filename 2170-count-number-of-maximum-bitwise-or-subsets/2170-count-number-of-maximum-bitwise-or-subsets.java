class Solution {
      public int count(int [] nums , int id, int cor, int  max)
      {
        if(id== nums.length) return (cor== max)? 1:0;
    int notcount =    count(nums, id+1, cor,  max);
    cor |= nums[id];
      int count = count(nums, id+1, cor,  max);
return count + notcount;
        
      }
    public int countMaxOrSubsets(int[] nums) {
        int max =0;
        for(int i : nums)
        {
            max |=i;
        }
      return   count(nums, 0, 0,  max);
        
    }
}