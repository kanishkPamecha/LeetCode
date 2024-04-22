class Solution {
   public  Set<String> visited = new HashSet<>();
   public  Set<String>   fill(String lock  )
   {
       Set<String> new1 = new HashSet<>(); 
      char [] lockchar = lock.toCharArray();
      for(int i =0 ;i<4 ;i++)
      {
        char c = lockchar[i];
        lockchar[i]=c== '9'?'0':(char)(c+1);
        new1.add(new String(lockchar));
            lockchar[i]=c== '0'?'9':(char)(c-1);
        new1.add(new String(lockchar));
        lockchar[i]=c;
      }
      return new1;
   }
    public int openLock(String[] deadends, String target) {
           
           for(String a : deadends)
           {
             visited.add(a);
           }
         
         Queue <String> n1 = new LinkedList<>();
         int level =0;
         n1.add("0000");
                  while(!n1.isEmpty())
                  {
                    int size = n1.size();
                    while(size-->0)
                    {
                        String currentlock = n1.poll();
                        if(visited.contains(currentlock)) continue;
                        if(currentlock.equals(target)) return level;
                        for(String nextlock : fill(currentlock))
                        {
                            if(!visited.contains(nextlock)) n1.add(nextlock);

                        }
                        visited.add(currentlock);
                    } 
                    level++;
                  }
        
        return -1;

    }

}