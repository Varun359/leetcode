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
  int max;
   public int height(TreeNode root)
    {
        if(root==null)
            return 0;
        return 1+Math.max(height(root.left),height(root.right));
            
    }
    public void check_height(TreeNode root)
    {
        if(root!=null)
        {
            int h=height(root.left)-height(root.right);
            if(h<0)
                h=-h;
            if(h>max)
                max=h;
            check_height(root.left);
            check_height(root.right);
        }
    }
    public boolean isBalanced(TreeNode root) {
        
        check_height(root);
        if(max>=2)
            return false;
        return true;
    }
}