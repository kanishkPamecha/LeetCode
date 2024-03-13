class Solution {
    public int pivotInteger(int n) {
 if(n==1 || n==0) return n;
      int SumLeft =  1;
      int SumRight = 1;
for(int i = 2 ;i<=n ;i++)
{
    SumRight += i;
}

     
      for (int num = 2; num <= n; num++) {
            SumLeft += num - 1; 
            SumRight -= num;   
            if (SumLeft == SumRight) {
                return num;
            }
            }
return -1;
    }
}