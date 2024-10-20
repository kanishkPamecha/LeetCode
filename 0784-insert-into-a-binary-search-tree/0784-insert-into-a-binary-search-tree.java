/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null ) return new TreeNode(val);
        TreeNode temp = root;
        while(temp!=null)
        {
            if(temp.val>val) 
            {if(temp.left!=null){temp=temp.left;}
            else {
TreeNode a = new TreeNode (val);
        temp.left= a; 
        break;
            }}
            else{
                if(temp.right!=null)temp=temp.right; 
            else {
TreeNode a = new TreeNode (val);
        temp.right= a;
        break;
            }}
        }
        
        return root;
    }
}