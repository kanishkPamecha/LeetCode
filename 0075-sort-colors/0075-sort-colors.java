class Solution {
    public void sortColors(int[] nums) {
        int count0=0;
        int count1=0;
        int count2=0;
        for(int i : nums)
        {
            if(i==1) count1++;
            if(i==0) count0++;
            if(i==2) count2++;

        }
        for(int i = 0;i<count0;i++)
        {
           nums[i] =0;
        }
        for(int i =0;i<count1;i++)
        {
     nums[i+count0] = 1;
        }
           for(int i =0;i<count2;i++)
        {
   nums[i+count0+count1] = 2;
        }
        

    }
}