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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
       
        List<List<Integer>> l = new ArrayList();
        
        zigzag(root, l, 0);
        
        return l;
    }
    
    public void zigzag(TreeNode root, List<List<Integer>> l, int level)
    {
        if(root == null)
            return;
        if(l.size() <= level)
         l.add(new ArrayList());
        
        if(level%2 == 0)
            l.get(level).add(root.val);
        else
            l.get(level).add(0, root.val);
        
        zigzag(root.left, l, level+1);
        zigzag(root.right, l, level+1);
        
    }
}