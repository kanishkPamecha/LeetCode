class Solution {
    static int min = Integer.MAX_VALUE;
    static TreeNode prev = null;
    public void trav(TreeNode root)
    {
        if(root == null) return ;
        trav(root.left);
      if(prev!=null) { int dif = Math.abs(prev.val-root.val);
     min =  Math.min(dif,min);
      }
      prev= root;
        trav(root.right);

    }
    public int getMinimumDifference(TreeNode root) {
        min = Integer.MAX_VALUE;
        prev = null;
        trav(root);
        return min;

    }
}