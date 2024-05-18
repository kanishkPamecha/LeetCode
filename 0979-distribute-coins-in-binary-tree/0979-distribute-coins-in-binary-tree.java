class Solution {
    private int moves = 0;
    private int distributeCoinsHelper(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int leftExcess = distributeCoinsHelper(node.left);
        int rightExcess = distributeCoinsHelper(node.right);
        int excess = node.val + leftExcess + rightExcess - 1;
       moves += Math.abs(leftExcess) + Math.abs(rightExcess);
        return excess;
    }

    
    public int distributeCoins(TreeNode root) {
        distributeCoinsHelper(root);
        return moves;
    }
}
