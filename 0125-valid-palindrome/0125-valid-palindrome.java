class Solution {
    public boolean isPalindrome(String s) {
      StringBuilder  ss = new StringBuilder();
     s=  s.toLowerCase();
       for(char c : s.toCharArray())
        {
           if( Character.isLetterOrDigit(c))
           {
               ss.append(c+"");
           }
        }
        
        s = ss.toString();
        int i =0 ;
        int j = ss.length()-1;
       
        while(i<j)
        {
            if(ss.charAt(i)!=ss.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;

    }
}