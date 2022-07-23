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
    public List<Integer> postorderTraversal(TreeNode root) {
      
        Stack<TreeNode> stack1 = new Stack();
        Stack<TreeNode> stack2 = new Stack();
        
        List<Integer> l = new ArrayList();
        
        if(root == null)
            return l;
        
        stack1.push(root);
        
        while(!stack1.isEmpty())
        {
            TreeNode ele = stack1.pop();
            stack2.push(ele);
                      
            if(ele.left!=null)
                stack1.push(ele.left);
            if(ele.right!=null)
                stack1.push(ele.right);

        }
        
        while(!stack2.isEmpty())
            l.add(stack2.pop().val);
       return l;
    }
}