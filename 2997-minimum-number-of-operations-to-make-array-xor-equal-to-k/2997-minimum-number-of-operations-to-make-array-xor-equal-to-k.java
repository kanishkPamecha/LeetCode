class Solution {
    public int minOperations(int[] nums, int k) {
        int  xor =0 ;
        for(int i =0 ;i< nums.length ;i++) 
        {

        xor =  xor ^ nums[i];
        }
        if(xor==k)return 0;
       else {
             int num  = xor^k;
             int count =0; 
             int l =1 ; 

              String s ="";
               
        while (num > 0) {
      s = s.concat(String.valueOf(num % 2));
            num = num / 2;
        }
        int kk = Integer.parseInt(s,2);
             while(kk>0)
             {
                 int a = kk%2;
                 if(a==1)count ++;
                kk=kk/2;
             }
return count;
       }
    }
}