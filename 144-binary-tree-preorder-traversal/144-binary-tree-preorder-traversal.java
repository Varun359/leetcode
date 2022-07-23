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
    public List<Integer> preorderTraversal(TreeNode root) {
        
        Stack<TreeNode> s = new Stack();
        List<Integer> l = new ArrayList();
        if(root == null)
            return l;
        s.add(root);
        while(!s.isEmpty())
        {
            TreeNode ele = s.pop();
            if(ele.right!= null)
                s.add(ele.right);
            if(ele.left!=null)
                s.add(ele.left);
            l.add(ele.val);
        }
        return l;
        
    }
}