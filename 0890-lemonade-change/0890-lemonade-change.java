class Solution {
    public boolean lemonadeChange(int[] bills) {
        int f =0;
        int t =0;
        int tw =0;

        for(int i : bills)
        {
           if(i==5) f++;
           if(i==10) {if(f>0) {t++; f--;}
            else return false;}
           if(i == 20 ){
            tw ++;
            if(t>0 && f>0) {t--; f--;}
              else if(f>2) f-=3;
              else return false;
           }
        }
        return true;
    }
}