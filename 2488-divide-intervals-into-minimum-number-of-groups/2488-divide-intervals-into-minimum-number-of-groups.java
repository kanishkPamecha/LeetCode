class Solution {
    public int minGroups(int[][] intervals) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        pq.add(intervals[0][1]);
        for(int i=1;i<intervals.length;i++){
            int x=intervals[i][0];
            if(!pq.isEmpty()&& pq.peek()<x){
                pq.remove();
            }
            pq.add(intervals[i][1]);
        }
        return pq.size();
    }
}