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
  public void  merge(List<Integer> a , List<Integer> b , List<Integer> c)
    {
        int i = 0;
        int n1  =  a.size();
        int j = 0;
        int n2 = b.size();

        while(i<n1 && j< n2)
        {
            if(a.get(i)<b.get(j)) c.add(a.get(i++));
            else c.add(b.get(j++));            
        }
         while(i<n1 )
        {
             c.add(a.get(i++));
        }
         while(j< n2)
        {
             c.add(b.get(j++));            
        }

    }
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        TreeNode temp = root1;
        List<Integer> ans = new ArrayList <>();
        List<Integer> ans1 = new ArrayList<>();
        List<Integer> a = new ArrayList<>();
    
        while(temp!=null)
        {
            if(temp.left!=null)
            {
                TreeNode pre = temp.left;
                while(pre.right!=null && pre.right!=temp)
                {
                    pre = pre.right;
                }
                if(pre.right== null)
                { pre.right  = temp;
                  temp =  temp.left;
                }
                if(pre.right== temp)
                {
                    pre.right=null;
                    ans.add(temp.val);
                    temp = temp.right;
                }
            }
            else{
                 ans.add(temp.val);
                    temp = temp.right;
            }
        }
        temp = root2;
        while(temp!=null)
        {
            if(temp.left!=null)
            {
                TreeNode pre = temp.left;
                while(pre.right!=null && pre.right!=temp)
                {
                    pre = pre.right;
                }
                if(pre.right== null)
                { pre.right  = temp;
                  temp =  temp.left;
                }
                if(pre.right== temp)
                {
                    pre.right=null;
                    ans1.add(temp.val);
                    temp = temp.right;
                }
            }
            else{
                 ans1.add(temp.val);
                    temp = temp.right;
            }
        }
            merge(ans, ans1, a);
            return a;

    }
}