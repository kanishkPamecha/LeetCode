import java.util.HashMap;

class Solution {
    public int minSubarray(int[] nums, int p) {
        int totalSum = 0;
        for (int num : nums) {
            totalSum = (totalSum + num) % p; // Calculate the total sum mod p
        }

        if (totalSum == 0) {
            return 0;         }

        HashMap<Integer, Integer>ans = new HashMap<>();
       ans.put(0, -1); 
           int prefixSum = 0, min = nums.length;
        
        for (int i = 0; i < nums.length; i++) {
            prefixSum = (prefixSum + nums[i]) % p;

            
            int target = (prefixSum - totalSum + p) % p;

            if (ans.containsKey(target)) {
              
                min = Math.min(min, i -ans.get(target));
            }

            
           ans.put(prefixSum, i);
        }

        return min == nums.length ? -1 : min;
    }
}
