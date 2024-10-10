class Solution {
    List<List<Integer>> answer = new ArrayList<>();
   public void  combo(int n , int k , int j, List<Integer>ans )
    {
         if(k==ans.size()){answer.add((new ArrayList<>(ans))); return ;}
         for(int i =j ;i<=n ;i++)
         {
            ans.add(i);
            combo(n,k,i+1,ans);
            ans.remove(ans.size()-1);
         }
         return;

    }
    public List<List<Integer>> combine(int n, int k) {
        List<Integer> ans = new ArrayList<>();
     combo(n,k,1,ans);
     return answer;   
    }
}