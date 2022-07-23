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
   
    public List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> s = new Stack();
        List<Integer> l = new ArrayList();
        TreeNode b = root;
        while(true)
        {
           if(b!=null)
           {
               s.push(b);
               b = b.left;
           }
           else
           {
               if(s.isEmpty())
                   break;
               b = s.pop();
               l.add(b.val);
               b = b.right;
           }
               
        }
        return l;
    }
}