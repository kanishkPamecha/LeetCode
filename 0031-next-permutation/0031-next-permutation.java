class Solution {
    public void nextPermutation(int[] nums) {
        int i = nums.length - 2;
        
        
        while (i >= 0) {
            if (nums[i] < nums[i + 1]) {
              
                int j = nums.length - 1;
                while (nums[j] <= nums[i]) {
                    j--;
                }
               
                nums[i] += nums[j];
                nums[j] = nums[i] - nums[j];
                nums[i] -= nums[j];
             
                Arrays.sort(nums, i + 1, nums.length);
                return;
            }
            i--;
        }
        
        
        Arrays.sort(nums);
    }
}
