class Solution {
    public int height(TreeNode n1) {
        if (n1 == null)
            return 0;
        return 1 + Math.max(height(n1.left), height(n1.right));
    }

    public void PrintnLevel(TreeNode n1, int count , List<Integer> ans  ) {
        if (n1 == null)
            return;
        if (count == 1) {
           ans.add(n1.val );
           return ;
        }
        PrintnLevel(n1.left, count-1,ans);
        PrintnLevel(n1.right, count-1 ,ans);
    }

    public void PrintnLevel2(TreeNode n1, int count ,List<Integer> ans ) {
        if (n1 == null)
            return;
        if (count == 1) {
           ans.add(n1.val);
           return ;
        }
        PrintnLevel2(n1.right, count-1,ans);
        PrintnLevel2(n1.left, count-1,ans);

    }

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        int h = height(root);
        List<List<Integer>> aa = new ArrayList<>();
        for (int i = 1; i <= h; i++) {
            List<Integer> ans = new ArrayList<>();
            if (i % 2 != 0) {
                PrintnLevel(root, i, ans);
            } else {
                PrintnLevel2(root, i, ans);
            }
              
            aa.add(ans);
        }

        return aa;
    }
}