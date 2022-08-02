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
        
        if(root == null)
            return new ArrayList();
        
        Queue<TreeNode> q = new LinkedList();
        List<Integer> l = new ArrayList();
        q.offer(root);
        while(!q.isEmpty())
        {
            int size = q.size();
            int ele = -1;
            while(size-->0)
            {
                TreeNode t = q.poll();
                ele = t.val;
                if(t.left != null)
                    q.offer(t.left);
                if(t.right != null)
                    q.offer(t.right);
            }
            l.add(ele);
        }
        return l;
        
    }
}