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

     public boolean same(TreeNode p, TreeNode q)
    {
        if(p== null )
        {
            if(q==null)return true;
            else return false;
        }
        if(q==null)return false;
        if(p.val == q.val && same(p.left , q.left) && same(p.right,q.right) ){return true;}
        else{return false;}
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
      return  same(p,q);
    }
}