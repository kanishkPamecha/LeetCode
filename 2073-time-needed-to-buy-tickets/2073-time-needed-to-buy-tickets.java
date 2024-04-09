class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
       int count=0;
    int gtct =0;
    for(int i = 0;i< tickets.length ;i++)
    {
        count+= Math.min(tickets[i],tickets[k]);
        if(k<i && tickets[i]>=tickets[k])
        {
            gtct ++;
        }
    }
return count -gtct ;
    }
}