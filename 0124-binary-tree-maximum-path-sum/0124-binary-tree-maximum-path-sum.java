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
    int res =0;
    public int maxPathSum(TreeNode root) {
        res = root.val;
        solve(root);
        return res;}
        public int solve(TreeNode root)
        {
            if(root== null)return 0;
            int left = solve(root.left);
            int right = solve(root.right);
            left = Math.max(left,0);
            right = Math.max(right, 0);

            res = Math.max(res,root.val+left+ right);
            return root.val+Math.max(left,right);
        }
}