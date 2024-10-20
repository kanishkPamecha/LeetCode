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
    public void flat(TreeNode root)
    { 
        if(root == null) return ;
        TreeNode a = root.right;
         
        flat(root.left);
        root.right = root.left;
        root.left = null;
        while(root.right!=null)
        {
            root= root.right;
            root.left=null;
        }
         flat(a);
        root.right = a;
       
        return;
    }
    public void flatten(TreeNode root) {

        flat(root);
        
    }
}