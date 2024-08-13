class Solution {
    private void fun(int ind,int target,int []arr,List<List<Integer>> res,List<Integer> ds){
       
           if(target==0){     //when target bocome 0 addall element of  arraylist in the in a list
               res.add(new ArrayList<>(ds));
               return ;
           }
         for(int i=ind;i<arr.length;i++){
           if(i>ind && arr[i]==arr[i-1]) continue;//
           if(target<arr[i]) break;
            ds.add(arr[i]);
            fun(i+1,target-arr[i],arr,res,ds);
             ds.remove(ds.size()-1);
        }
         
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        fun(0,target,candidates,ans,new ArrayList<>());
        return ans;
    }
}