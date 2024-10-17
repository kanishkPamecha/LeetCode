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
     public TreeNode invertTree(TreeNode root) {
        if(root == null){return null;}
        TreeNode left = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(left);
        return root;
    }
    public  boolean sameTree(TreeNode root1, TreeNode root2) {
             if(root1==null && root2== null) return true;
             if(root1==null || root2== null) return false;
             if(root1.val!=root2.val) return false;
             return sameTree(root1.left , root2.left) && sameTree(root1.right , root2.right);
         }
    public boolean isSymmetric(TreeNode root) {
        if(root ==null) return true; 
         
         TreeNode n1 = invertTree(root.left);
         
     return sameTree(n1,root.right);


    }
}