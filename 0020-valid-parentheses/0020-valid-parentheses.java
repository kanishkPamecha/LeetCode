class Solution {
    public boolean isValid(String s) {
      Stack<Character> n1 = new Stack<>();
n1.push('a');
      for(int i =0 ;i<s.length();i++)
      {
             char a = s.charAt(i);
             if(a=='(') n1.push(a);
             if(a=='{') n1.push(a);
             if(a=='[') n1.push(a);
             else if(a==')')
             {
                if(n1.peek()=='(')
                {
                    n1.pop();
                }
                else return false ;
             } 
                 else if(a=='}')
             {
                if(n1.peek()=='{')
                 n1.pop();
                else return false ;
             } 
                 else if(a==']')
             {
                if(n1.peek()=='[')n1.pop();
                else return false ;
             } 

      }
      if(n1.size()==1) return true;
      else return false;
      
    }
}