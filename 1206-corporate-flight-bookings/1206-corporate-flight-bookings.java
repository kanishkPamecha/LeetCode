class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {


int [] ans = new int [n];
       for(int i =0;i<bookings.length ;i++)
       {
           for(int j =bookings[i][0] ; j<=bookings[i][1];j++)
           {
            ans[j-1]+=bookings[i][2];
           }
       } 
       return ans;
    }
}