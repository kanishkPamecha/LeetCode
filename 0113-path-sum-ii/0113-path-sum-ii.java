
class Solution {
      
     public void  target (TreeNode root
    ,List<Integer>  arr,List<List<Integer>> ans
     , int targetSum)
     {
      if(root == null){return ; }
      arr.add(root.val);
      if(targetSum-root.val==0 && root.left == null && root.right==null)
      {       
          ans.add(arr);
          return ;}
         List<Integer> leftArr = new ArrayList<>(arr);
    List<Integer> rightArr = new ArrayList<>(arr);
    target(root.left, leftArr, ans, targetSum - root.val);
    target(root.right, rightArr, ans, targetSum - root.val);
        
        arr.remove(arr.size()-1);
     }

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List <Integer>  arr = new ArrayList <>();
       
         
        List<List<Integer>> ans = new ArrayList <>();
               target(root,arr,ans,targetSum);
               return ans;
    }
}