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
     public boolean findmatch(TreeNode root , TreeNode subroot)
{
    if(root == null){if(subroot==null) return true; else return false;}
    if(subroot == null) return false;
    if(root.val!=subroot.val) return false;
    return findmatch(root.left,subroot.left) && findmatch(root.right,subroot.right);
}
  public boolean  match(TreeNode root , TreeNode subroot)
    {  if(root == null) return  false;
     boolean x  = false;
        if(root.val == subroot.val) {  x = findmatch(root ,subroot);}
      
        return x || match(root.left,subroot) || match(root.right,subroot);
    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        
       return match(root,subRoot);

    }
}