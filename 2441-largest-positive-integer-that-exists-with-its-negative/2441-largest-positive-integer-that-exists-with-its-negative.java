class Solution {
    public int findMaxK(int[] nums) {
        
        Arrays.sort(nums);
   HashMap<Integer,Integer> n1 = new HashMap<>();
       for(int i :nums)
       {
              n1.put(i,1);
       } 
       for(int i = nums.length-1;i>=0;i--)
    { if(n1.containsKey((-nums[i]))) 
     {
          return nums[i];
     }}
return -1;
    }
}