class Solution {
    public boolean checkRecord(String s) {
        int latecount =0 ;
        int abcount =0;
        for(int i =0 ;i< s.length();i++)
        {
   if(s.charAt(i)=='A'){
   abcount++;   latecount =0;
    if(abcount>1){return false;}
   }
      if(s.charAt(i)=='L'){
   latecount++;
        if(latecount>2){return false;}
   }
   else{latecount =0;}
        }
        return true;
    }
}