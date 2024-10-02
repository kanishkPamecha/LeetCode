class Solution {
    public String convert(String s, int numRows) {
        
        if(numRows<2) return s;
   int count =0;
   boolean a =true;
   StringBuilder  [] str = new StringBuilder [numRows]; 
   for(int i =0 ;i<numRows;i++)
   {
        StringBuilder ans = new StringBuilder("");
    str[i] = ans;
   }
        for(char c :s.toCharArray())
        {   
            StringBuilder ans = str[count];
              ans.append(""+c);   
              str[count] = ans;
              if(count==numRows-1) a =false;
              if(count==0) a = true;
               if(a) count++;
               else count--;
        }
        
StringBuilder fs= new StringBuilder("");
for(int i =0 ;i<numRows;i++)
   {
StringBuilder ss = str[i];
    fs.append(ss);
  }
  return fs.toString();
    }
}