class Solution {
    public StringBuilder SN(int n) {
        if (n == 0 || n == 1) {
            StringBuilder a = new StringBuilder("0");
            return a;
        }
        StringBuilder a = SN(n - 1);
        StringBuilder ans = new StringBuilder();
        ans.append(a + "1" + rev(a));
        return ans;
    }

    public String rev(StringBuilder aaa) {
        aaa.reverse();
        String ans = aaa.toString();
         StringBuilder ansa = new StringBuilder();
        char[] c = ans.toCharArray();
        for (char ch : c) {
            if (ch == '0')
                ansa.append('1'+"");
            else if(ch =='1')
                 ansa.append('0'+"");
        }
       return  ansa.toString();
    }

    public char findKthBit(int n, int k) {

        return SN(n).toString().charAt(k-1);
       

    }
}