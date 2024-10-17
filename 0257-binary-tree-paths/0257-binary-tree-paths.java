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
    

        public void helper(TreeNode root , ArrayList<Integer> ans,List<String> result)
        {  
            if(root== null) {
                System.out.println(ans);
                return ;
            }
            ans.add(root.val);
             if(root.left== null && root.right== null)
        {  System.out.println(ans);
            StringBuilder aaaa= new StringBuilder();
           for(int i =0;i<ans.size();i++)
           {
            int a = ans.get(i);
            aaaa.append(a);
            if(i!=ans.size()-1)  aaaa.append("->");
           }
           result.add(aaaa.toString());
           ans.remove(ans.size()-1);
                return ;
        }
            helper(root.left,ans,result);
             helper(root.right,ans,result);
            ans.remove(ans.size()-1);

        }

    public List<String> binaryTreePaths(TreeNode root) {
        ArrayList<Integer> ans = new ArrayList<>(); 
        List<String> result = new ArrayList<>();
        helper(root,ans , result);
        
        return result;



    }
}