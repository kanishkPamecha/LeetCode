class Solution {
    public int minimumChairs(String s) {
        
        int count=0;
        int extra =0;
        for(char c : s.toCharArray())
        {
            if(c=='E'){
                if(extra==0)count++;
                else {extra-=1;}}
            if(c=='L'){extra++;}
        }
return count ;
    }
}