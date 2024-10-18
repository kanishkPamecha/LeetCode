/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int height (TreeNode root)
    {
        if(root== null) return 0;
        return 1+ Math.max( height(root.left) , height(root.right)); 
    }
    public void level(TreeNode root , int h,List<Integer> res)
    {
         if(root== null) return ;
         if(h==1) {res.add(root.val);return ;}
         level(root.left,h-1,res);
          level(root.right,h-1,res);

    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        int height = height(root);
        List<List<Integer>> ans = new ArrayList<>();
        for(int i =1;i<=height ;i++)
        {List<Integer> res = new ArrayList<>();
          level(root,i,res);
          ans.add(res);
        }
 return ans;

    }
}