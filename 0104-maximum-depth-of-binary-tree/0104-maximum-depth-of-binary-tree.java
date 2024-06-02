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
    public int max(TreeNode root )
    {
        int l=0 ,r =0;
        if(root!=null)
        {
          l= 1+  max(root.left);
          r=  1+max(root.right);
        }
        return Math.max(l,r);
    }
    public int maxDepth(TreeNode root) {
     return   max(root);
    }
}