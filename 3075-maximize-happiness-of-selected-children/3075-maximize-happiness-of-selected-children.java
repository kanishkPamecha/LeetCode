class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        int l =happiness.length -1;
        long count =0;
        for(int i =0 ;i<k ;i++)
        {
            if(happiness[l]>i) 
              { count += happiness[l--] -i; }
            else 
                count+=0;
        }
        return count;
    }
}
