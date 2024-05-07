class Solution {
    public boolean isPalindrome(String s) {
        int i =0 ;
        String a = s.toLowerCase();
        int j = a.length()-1;
        while(i<j)
        { char a1 =a.charAt(i);
        char a2 = a.charAt(j);
           if((Character.isLetter(a1) || Character.isDigit(a1)) && (Character.isLetter(a2) || Character.isDigit(a2)))
           {
                 if(a1!=a2){return false;}
                 i++;j--;
           }
 else{
    if(!(Character.isLetter(a1) || Character.isDigit(a1) )){i++;}
    else{j--;}}
 
 }
 return true;
}
}