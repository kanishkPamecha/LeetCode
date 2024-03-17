class Solution {
    public String mergeAlternately(String word1, String word2) {
 StringBuilder str  =new StringBuilder();
       int n1 =word1.length();
       int n2 = word2.length();
       int i=0 ;int j =0;
       while(i<n1 && j<n2)
       {
 str.append(word1.charAt(i++));
 str.append(word2.charAt(j++));

       } 
            while(i<n1 )
       {
 str.append(word1.charAt(i++));

 
       } 
            while(j<n2)
       {

 str.append(word2.charAt(j++));
 
       } 
       return str.toString();
    }
}