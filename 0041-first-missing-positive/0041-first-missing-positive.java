class Solution {
    public int firstMissingPositive(int[] nums) {
      int count =1;
       Arrays.sort(nums);
       for(int i : nums)
       {
        if(i == count)
        {
            count++;
        }
       }
       return count;
    }
}