class Solution {
    public boolean isAnagram(String s, String t) {
        
        Map<Character , Integer>  n1 = new HashMap<>();
        
        for(char c : s.toCharArray())
        { 
            if(n1.containsKey(c))
           { n1.put(c,n1.get(c)+1);}
           else
          { n1.put(c,1);}
        }
        for(char c : t.toCharArray())
        {
            if(n1.containsKey(c)){
                if(n1.get(c)==1){n1.remove(c);}
                else {n1.put(c,n1.get(c)-1);}
            }
            else{return false;}
        }
        if(n1.size()>0){return false;}
     return true;
    }
}