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
     public TreeNode sort(int [] nums, int low, int high )
     { if(low>high) return null;
        if(low == high) return new TreeNode(nums[low]);
        int mid = low + (high - low)/2;
        TreeNode a = new TreeNode(nums[mid]);
      
        a.left = sort(nums, low, mid-1);
        a.right = sort(nums,mid+1 , high);
        return a;

     }
    public TreeNode sortedArrayToBST(int[] nums) {
         int low =0;
         int high = nums.length-1;

         return sort(nums,low,high);
    }
}