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
    //Stack<Integer> s = new Stack();
    TreeNode prev;
    boolean invalid = true;
    public boolean isValidBST(TreeNode root) {
        
        if(root == null || (root.left == null && root.right == null))
            return true;
       validate(root);
       return invalid;
    }
    
    public void validate(TreeNode root)
    {
        if(root==null)
            return;
        validate(root.left);
        if(prev!=null && prev.val >= root.val)
        {   invalid = false;
            return;
        }
        System.out.println(root.val);
        prev = root;
        validate(root.right);
    }
}