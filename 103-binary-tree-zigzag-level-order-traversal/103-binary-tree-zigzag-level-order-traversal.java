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
        
        if(root == null)
            return new ArrayList();
        List<List<Integer>> result = new ArrayList();
        Queue<TreeNode> q = new LinkedList();
        
        q.add(root);
        int z = 1;
        while(!q.isEmpty())
        {
            int size = q.size();
            List<Integer> l = new ArrayList();
            while(size-->0)
            {
                TreeNode e = q.poll();
                l.add(e.val);
                if(e.left!=null)
                 q.add(e.left);
                if(e.right!=null)
                 q.add(e.right);
            }
            System.out.println(l);
            if(z%2 == 0)
            {
            List<Integer> rev = new ArrayList();
            for(int i = l.size()-1; i>=0 ; i--)
                rev.add(l.get(i));
                result.add(rev);
            }
            else
              result.add(l);
            z++;
        }
        return result;
    }
}