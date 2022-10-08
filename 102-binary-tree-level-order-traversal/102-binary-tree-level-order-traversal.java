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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> level_order = new ArrayList();
        if(root == null)
            return level_order;
        Queue<TreeNode> q = new LinkedList();
        q.add(root);
        
        while(!q.isEmpty())
        {
            int size = q.size();
            List<Integer> temp = new ArrayList();
            while(size-->0)
            {
                TreeNode t = q.poll();
                if(t.left!=null) q.offer(t.left);
                if(t.right!=null) q.offer(t.right);
                
                temp.add(t.val);
            }
            level_order.add(temp);
        }
        return level_order;
    }
}