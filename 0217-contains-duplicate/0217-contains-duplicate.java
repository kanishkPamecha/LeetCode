class Solution {
    public boolean containsDuplicate(int[] nums) {
         
         Map <Integer, Integer> n1 = new HashMap<>();
        for(int i: nums)
        {
            if(n1.containsKey(i)) return true;
            else {
                n1.put(i,1);
            }
        }
        return false;
    }
}