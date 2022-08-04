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

// strivers solution but root node is taken as 1

class Pair{
    int number;
    TreeNode t;
    Pair(TreeNode t, int number)
    {
        this.number = number;
        this.t = t;
    }
}
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
     
        if(root == null)
            return 0;
        Queue<Pair> q = new LinkedList();
        
        int max = 0;
        q.add(new Pair(root, 1));
        while(!q.isEmpty())
        {
            int size = q.size();
            int min = q.peek().number;
            int first = 1, last = 1;
            for(int i = 0 ; i < size; i++)
            {
                int val = q.peek().number - min+1;
                TreeNode t = q.poll().t;
                if(i == 0)
                    first = val;
                else if(i == size-1)
                    last = val;
                if(t.left!=null)
                    q.offer(new Pair(t.left, 2* val));
                if(t.right!=null)
                    q.offer(new Pair(t.right, 2*val + 1));
                    
            }
            max = Math.max( max , (last- first)+1);
        }
        return max;
    }
}