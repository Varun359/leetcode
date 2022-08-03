/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        Deque<TreeNode> q1 = new LinkedList();
        Deque<TreeNode> q2 = new LinkedList();

        findEle(q1, root, p);
        findEle(q2, root, q);
     
        TreeNode t = null;
        
        while(!q1.isEmpty() || !q2.isEmpty())
        {
            if(q1.peekFirst() == q2.peekFirst())
            { t = q1.pollFirst();
              q2.pollFirst();
            }
            else
                break;
        }
        return t;
    }
    
    public boolean findEle(Deque<TreeNode> q, TreeNode root, TreeNode find)
    {
        if(root == null)
            return false;
         q.addLast(root);
        if(root==find)
            return true;
        
       
        if(findEle(q,root.left,find) || findEle(q,root.right, find))
            return true;
        
        q.removeLast();
            return false;
    }
}