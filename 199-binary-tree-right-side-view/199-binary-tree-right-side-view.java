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
    public List<Integer> rightSideView(TreeNode root) {
      
      List<Integer> l = new ArrayList();
      iterate(root, l, 0);
      return l; 
    }
    
    public void iterate(TreeNode root, List<Integer> l, int depth)
    {
        if(root == null)
            return;
        if(l.size() == depth)
            l.add(root.val);
        iterate(root.right, l, depth+1);
        iterate(root.left, l, depth+1);
    }
}