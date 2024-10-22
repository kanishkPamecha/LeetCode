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
    public List<Integer> inorderTraversal(TreeNode root) {
                //  if(root== null) return null;
        TreeNode temp = root;
            List<Integer> ans = new ArrayList<>();
        while(temp!=null)
        {
            if(temp.left!=null)
            {
                TreeNode pred = temp.left;
                while(pred.right!=null && pred.right!=temp)
                {
                     pred = pred.right;

                }
                if(pred.right == null)
                {
                    pred.right = temp;
                    temp = temp.left;
                }
                if(pred.right==temp)
                {
                    pred.right = null;
                    ans.add(temp.val );
                    temp = temp.right;
                }

            }
            else{
                ans.add(temp.val );
                temp = temp.right;
            }

        }
        return ans;
    
    }
}