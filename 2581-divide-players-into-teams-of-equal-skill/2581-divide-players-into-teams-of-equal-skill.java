class Solution {
    public long dividePlayers(int[] skill) {
        
      Arrays.sort(skill);

      int i =0 ;
      int j = skill.length-1;
 int sum = -1;
 long ans =0;
         while(i<j)
      { 
          int count = skill[i]+skill[j];  
         if(sum==-1) sum = count;
         if(count!=sum) return -1;
         ans+= (skill[i]*skill[j]);

         i++;j--;
      }

      return ans ;


    }
}