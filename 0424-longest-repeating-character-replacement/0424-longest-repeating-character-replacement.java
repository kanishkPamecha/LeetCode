class Solution {
    public int characterReplacement(String s, int k) {
        int[] hash=new int[26];
        for(int i=0;i<hash.length;i++){
            hash[i]=0;
        }
        int n=s.length();
        int l=0,r=0;
        int maxf=0;
        int maxlen=0;
        while(r<n){
            char ch=s.charAt(r);
            char ch1=s.charAt(l);
            hash[ch-'A']++;
            maxf=Math.max(maxf,hash[ch-'A']);
    
            if((r-l+1)-maxf>k){
                hash[ch1-'A']--; 
                l++;
            }
            if((r-l+1)-maxf<=k){
                maxlen=Math.max(maxlen,r-l+1);
                
            }
            r++;
           
        }
         return maxlen;
    }
}