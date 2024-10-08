class Solution {
    public int minSwaps(String s) {
        
        int count =0;
        int swap =0;

        for(int i =0 ;i< s.length();i++)
        {
           if(s.charAt(i)=='[') count++;
           else  count--;

        swap = Math.min(swap,count);

        }
        return (-swap+1)/2;
    }
}