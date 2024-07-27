/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

   String split =",";
    public String serialize(TreeNode root) {
        StringBuilder s = new StringBuilder();
        S(root,s);
        return s.toString(); 
    }
   public void S(TreeNode node , StringBuilder s)
   {
    if(node== null) s.append("N").append(split);
    else {
        s.append(node.val).append(split);
        S(node.left ,s);
        S(node.right ,s);

    }
   }
  public TreeNode deserialize(String data) {
   Deque<String> nodes  = new LinkedList<>();
   nodes.addAll(Arrays.asList(data.split(split)));
   return buildTree(nodes);
}
  private TreeNode buildTree(Deque<String> nodes)
  {
    String val = nodes.remove();
    if(val.equals("N")) return null;
    else {
        TreeNode node = new TreeNode(Integer.valueOf(val));
        node.left = buildTree(nodes);
        node.right = buildTree(nodes);
        return node;
    }
  }
}

