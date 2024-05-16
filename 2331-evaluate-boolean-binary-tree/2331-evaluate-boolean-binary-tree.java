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
    public boolean ans (TreeNode root){
        if(root.val==0)return false;
        if(root.val==1) return true;
        if(root.val ==2) return ans( root.left) || ans(root.right);
        if(root.val == 3) return ans(root.left) && ans(root.right);
return true;
    }
    public boolean evaluateTree(TreeNode root) {
        return ans(root);
    }
}