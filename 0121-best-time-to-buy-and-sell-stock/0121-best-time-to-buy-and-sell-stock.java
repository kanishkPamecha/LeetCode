class Solution {
    public int maxProfit(int[] prices) {
        
          int [] leftmin  = new int [prices.length];
 int [] rightmax  = new int [prices.length+1];
   int n = prices.length-1;
 leftmin[0]= prices[0];
 rightmax[prices.length-1] =prices[prices.length-1];
  for(int i = 1 ;i< n ;i++)
  {
      leftmin[i] = Math.min(leftmin[i-1] , prices[i]); 

 }
  for(int i = prices.length-2 ;i>=0 ;i--)
  {
      rightmax[i] = Math.max(rightmax[i+1] , prices[i]); 

 }
  int max = 0;
for(int i =0 ;i< n ;i++)
{ 
  max = Math.max(max, rightmax[i]-leftmin[i]);

  
}
return max;

        
    }
}