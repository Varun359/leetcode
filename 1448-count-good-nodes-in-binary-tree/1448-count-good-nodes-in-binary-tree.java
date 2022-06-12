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
    int count=0;
    public int goodNodes(TreeNode root) {
        goodNodes(root, root.val);   
        return count;
    }
    
    public void goodNodes(TreeNode root, int max)
    {
        if(root==null)
            return;
        if(root.val >= max)
            count++;
        goodNodes(root.left,Math.max(max,root.val));
        goodNodes(root.right,Math.max(max,root.val));
    }
}