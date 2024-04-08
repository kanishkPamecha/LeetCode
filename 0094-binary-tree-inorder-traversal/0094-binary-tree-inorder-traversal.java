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
    public void fun(TreeNode root,  List<Integer> n1)
    {
        
          if(root==null)return ;
        fun(root.left,n1);
n1.add(root.val);
        fun(root.right, n1);
        
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> n1 = new ArrayList<>();
        fun(root, n1);
        return n1;
    }
}