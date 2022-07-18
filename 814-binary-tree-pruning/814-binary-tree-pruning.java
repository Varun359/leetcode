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
    public boolean hasOne(TreeNode root)
    {
        if(root.val == 0)
            return false;
        return true;
    }
    public TreeNode pruneTree(TreeNode root) {
       if(root == null)
           return null;
       root.left = pruneTree(root.left);
       root.right = pruneTree(root.right);
        
       
       if(!hasOne(root) && root.left == null && root.right == null)
         root = null;
       return root;
    }
}