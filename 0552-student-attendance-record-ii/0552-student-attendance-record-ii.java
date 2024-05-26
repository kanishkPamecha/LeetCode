import java.util.*;

class Solution {
    static int MOD = 1000000007;

    public int checkRecord(int n) {
        int[][][] dp = new int[n + 1][2][3]; // dp[index][absentCount][lateCount]
        return att(n, 0, 0, dp);
    }

    private int att(int index, int absentCount, int lateCount, int[][][] dp) {
        if (index == 0) {
            return 1;        }
        
        if (dp[index][absentCount][lateCount] != 0) {
            return dp[index][absentCount][lateCount]; 
        }

        int ans = 0;
        ans = (ans + att(index - 1, absentCount, 0, dp)) % MOD;

        
        if (absentCount == 0) {
            ans = (ans + att(index - 1, 1, 0, dp)) % MOD;
        }

      
        if (lateCount < 2) {
            ans = (ans + att(index - 1, absentCount, lateCount + 1, dp)) % MOD;
        }

      
        dp[index][absentCount][lateCount] = ans;
        
        return ans;
    }
}
