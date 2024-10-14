class Solution {
    public int findPeakElement(int[] nums) {
      
        int i =0;
        int j = nums.length-1;
       
        while(i<=j)
         { 
            int mid = i + (j-i)/2;
            if((mid ==0 || nums[mid]>nums[mid-1]) &&  (mid== nums.length-1 || nums[mid]>nums[mid+1])) return mid;
            if(nums[mid]> nums[mid+1]){j=mid-1;}
            else {i= mid+1;}    
         }
         return -1;

   
    }
}