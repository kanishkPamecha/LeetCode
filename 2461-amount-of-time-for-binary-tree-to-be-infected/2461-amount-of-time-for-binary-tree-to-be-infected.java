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
    public TreeNode start (TreeNode root, int start)
    {
        if(root ==  null || root.val== start) return root;
        TreeNode left = start(root.left , start);
        TreeNode right = start(root.right , start);
        if(left == null) return right ;
        return left;

    }
    public void preorder(TreeNode root, HashMap<TreeNode , TreeNode> parent)
    {
        if(root == null) return ;
         
         parent.put(root.left, root);
         parent.put(root.right , root);
        preorder(root.left, parent);
        preorder(root.right, parent);

    }
 
    public int amountOfTime(TreeNode root, int start) {

        if(root==null) return 0;
         TreeNode startNode = start(root, start);

        HashMap<TreeNode , TreeNode> parent = new HashMap<>();
        preorder(root,parent);
        HashMap<TreeNode , Integer> time = new HashMap<>();
        Queue<TreeNode> Q = new LinkedList<>();
        Q.add(startNode);
        int max = 0;
        time.put(startNode,-1);
          while(!Q.isEmpty())
       {
            TreeNode a = Q.poll();
            int count = time.get(a)+1;
            System.out.println(count);
            if(a.left!=null && !time.containsKey(a.left)) {time.put(a.left,count);Q.add(a.left);}
             if(a.right!=null && !time.containsKey(a.right)) {time.put(a.right,count);Q.add(a.right);}
         TreeNode p=    parent.get(a);
          if(p!=null && !time.containsKey(p)) {time.put(p,count);Q.add(p);}
        max = Math.max(max, count);
     }
        return max;
    }
}