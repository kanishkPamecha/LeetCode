class Solution {
    public boolean canJump(int[] nums) {
        if(nums.length ==1 ) return true;
         int count = 0;
        for(int i=nums.length -2 ; i>=0; i--){
            if(nums[i] <= count){
                count++;
            }
            else{
                count = 0;
            }
           
        }
        if(nums[0] >count) return true;
        return false;
    }
}