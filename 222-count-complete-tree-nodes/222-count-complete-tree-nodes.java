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
    public int countNodes(TreeNode root) {
        if(root == null)
            return 0;
        int c = 1;
        c+= countNodes(root.left);
        c+= countNodes(root.right);
        return c;
    }
    
//     public int countNodes(TreeNode root, int c)
//     {
//         if(root == null)
//             return 0;
//         int c = 1;
//         c+ = countNodes(root.left, c);
//         c+ = countNodes(root.right, c);
//         return c;
        
//     }
}