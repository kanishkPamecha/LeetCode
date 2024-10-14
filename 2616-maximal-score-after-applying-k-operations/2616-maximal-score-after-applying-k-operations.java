class Solution {
    public long maxKelements(int[] nums, int k) {
        // priority Queue Intialize
        PriorityQueue<Integer> ans = new PriorityQueue<>((a, b) -> b - a);

        // add numbers to the heap
        for (int i : nums) {
            ans.add(i);
        }
      long score = 0;
        for (int i = 0; i < k; i++) {

            // taking the largest no;
            int max=ans.poll();
           
            // adding it to the and taking ceil
           
            score += max;
            // again adding the number to heap;
            ans.add((int)Math.ceil(max/3.0));
        }
        return  score;
    }
}