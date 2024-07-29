class Solution { 

      public int cot(String[] strs)
      { 
        int count =0;
  for(int i =0 ; i< strs[0].length();i++)
      {
           for(String s : strs)
           {
              if(s.length()<=i) return count ;
              if(strs[0].charAt(i)!=s.charAt(i)) return count ;
           }
      count ++ ;
      }
      return count;
      }
    public String longestCommonPrefix(String[] strs) {
     int x = cot(strs);

     StringBuilder ans = new StringBuilder();

     for(int i =0; i<x;i++)
     {
         ans.append(strs[0].charAt(i)+"");
     }
return ans.toString();
    
          
    
    
    }
}