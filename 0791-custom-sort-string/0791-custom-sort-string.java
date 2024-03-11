class Solution {
    public String customSortString(String order, String s) {
       Map<Character, Integer> mp = new java.util.HashMap<>();
        StringBuilder str = new StringBuilder();
      
      for(char c: s.toCharArray())
      {
            mp.put(c, mp.getOrDefault(c, 0) + 1);
      }
  
    for (int i = 0; i < order.length(); i++) {
            char c = order.charAt(i);
            if (mp.containsKey(c)) {
                int count = mp.get(c);
                for (int j = 0; j < count; j++) {
                    str.append(c);
                }
                mp.remove(c); 
            }
        }
  for(char c :s.toCharArray() )
  {
      if (mp.containsKey(c)) {
                int count = mp.get(c);
                for (int i = 0; i < count; i++) {
                    str.append(c);
                }
                mp.remove(c); 
            }
        }
 return str.toString();
    }
}