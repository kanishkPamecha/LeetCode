class Solution {
    public int majorityElement(int[] nums) {
          if(nums.length==1) return nums[0];
          Arrays.sort(nums);
          int count =1;
 int i =1;
          while(i<nums.length)
          { 
            
                   if(nums[i]==nums[i-1]) count++;
                   else count =1;
                   if(count>nums.length/2) return nums[i];
                   i++;
          }
 return 0;
    }
}