class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int [] ans = new int[2];

        int i =0;
        int j = numbers.length-1;
        ans[0]=i;
        ans[1]=j;
 int sum =Integer.MIN_VALUE;
        while(i<j&& target!=sum)
        {
   sum = numbers[i]+numbers[j];
            if(sum<target) i++;
            if(sum>target) j--;
            if(target==sum){
                ans[0]=i+1;
                ans[1]=j+1;
                return ans;
            }
        }

        return ans;

    }
}