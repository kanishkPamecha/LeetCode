class Solution {
    public int climb(int n ,int idx,int []dp)
    { 
         if(idx>n) return 0;
           if(idx==n) return 1 ; 
             if(dp[idx]!=-1)return dp[idx];
                 int Climb1 = climb(n, idx+1,dp);
                 int Climb2 = climb(n , idx+2,dp);
      return dp[idx] = Climb1+Climb2;
     }
    public int climbStairs(int n) {
        int []dp = new int [n]; 
        for(int i =0 ;i<n ;i++)
        {
            dp[i]=-1;
        }
    return  climb(n,0 ,dp );
    }
}