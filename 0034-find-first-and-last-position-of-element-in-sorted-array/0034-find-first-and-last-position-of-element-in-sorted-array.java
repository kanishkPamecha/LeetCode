class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
        ans[0] = -1;
        ans[1] = -1;

        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] >= target) {
                right = mid - 1;} else {  left = mid + 1;  }
        } 
         if (left >= nums.length || nums[left] != target) {    return ans;  }
        ans[0] = left;   
        //lef
        right = nums.length - 1;
         // right
        while (left <= right) {
            int mid = left + (right - left) / 2; if (nums[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid - 1;   }
        }
        ans[1] = right;    return ans;
    }
}
