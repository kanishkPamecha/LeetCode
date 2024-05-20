class Solution {
     public  void reverseArray(int[] array) {
        int start = 0;
        int end = array.length - 1;
        while (start < end) {
            // Swap elements at start and end
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }
    public int removeElement(int[] nums, int val) { 
        int l = nums.length;
        for(int x=0; x< nums.length ;x++)
        { 
            if(nums[x]==val){ nums[x]=-1; l--;}

        }  
        Arrays.sort(nums);
        reverseArray(nums);
        return l;
    }
}