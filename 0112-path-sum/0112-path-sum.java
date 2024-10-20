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
    public boolean helper(TreeNode root, int targetSum, int count){

        if(root== null ){ return false;}
        if(root.left == null && root.right == null)
       { if(targetSum == count+root.val ) return true; else return false;}
         return helper(root.left, targetSum, count+root.val) || helper(root.right, targetSum, count+root.val);
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null ) return false;
       return helper(root,targetSum , 0);
    }
}