class Solution {
    public int[] plusOne(int[] digits) {
        int j = digits.length-1;
        int carry =1;
        while(true)
        {
            if(j==-1) {
                int [] n = new int [digits.length+1];
                n[0]=1;
                for(int i = 1;i< digits.length ;i++)
                {
                    n[i] = digits[i-1];
                }
                return n;
            }
            else{
                digits[j] =  digits[j]+carry;
                if(digits[j]>9) {carry =1;
                digits[j]%=10;
                j--;}
                else { return digits;}
            }
        }
    
    }
}