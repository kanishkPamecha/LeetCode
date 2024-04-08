class Solution {
    public int findKthLargest(int[] nums, int k) {
        
        PriorityQueue<Integer> n1 = new PriorityQueue<>(k);
        for(int i : nums)
        {
            if(n1.size()<k){
                n1.add(i);
            }
            else if(i>n1.peek()){
                n1.remove();
                n1.add(i);
            }
            
        }
       
        return n1.peek();
        
    }
}