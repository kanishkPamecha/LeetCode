class Solution {

    static final int[]mhar = new int[100001];

    int CMH = 0;

    public int[] treeQueries(TreeNode root, int[] queries) {
        ltr(root, 0);
        CMH = 0; 
        rtl(root, 0);

        int queryCount = queries.length;
        int[] queryResults = new int[queryCount];
        for (int i = 0; i < queryCount; i++) {
            queryResults[i] =mhar[queries[i]];
        }

        return queryResults;
    }

    private void ltr(TreeNode node, int currentHeight) {
        if (node == null) return;

        mhar[node.val] = CMH;
        CMH = Math.max(CMH, currentHeight);

        
        ltr(node.left, currentHeight + 1);
        ltr(node.right, currentHeight + 1);
    }

    private void rtl(TreeNode node, int currentHeight) {
        if (node == null) return;

       mhar[node.val] = Math.max(
           mhar[node.val],
            CMH
        );

         CMH = Math.max(currentHeight, CMH);

         rtl(node.right, currentHeight + 1);
        rtl(node.left, currentHeight + 1);
    }
}