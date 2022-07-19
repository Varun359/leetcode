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
    int count = 0;
    int h = 0;
    public int kthSmallest(TreeNode root, int k) {
        
        if(root == null)
            return 0;
        if(root.left == null && root.right == null && k==1)
            return root.val;
         findAllValues(root, k);
         return h;
    }
    
    public void findAllValues(TreeNode root, int k)
    {
        if(root == null)
            return;
        findAllValues(root.left,k);
        count++;
         if(count == k)
         {
             h = root.val;
         }
        findAllValues(root.right,k);
    }
}