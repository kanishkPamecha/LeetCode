class Solution {
    public int reverse(int x) {
    boolean s =true;
          
          long ans =0;
        while(x!=0)
        { 

            int a = x%10;
            x/=10;
            ans*=10;
            ans+=a;
            if(ans>Integer.MAX_VALUE||ans<Integer.MIN_VALUE)
                return 0;
        }
        

         
                return (int)ans;

    }
}