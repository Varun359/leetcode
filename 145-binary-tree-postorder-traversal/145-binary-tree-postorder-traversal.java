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
      
        Stack<TreeNode> stack = new Stack();
        List<Integer> l = new ArrayList();
        
        if(root == null)
            return l;
        TreeNode curr = root;   
        while(!stack.isEmpty() || curr!=null)
        {
            if(curr!=null)
            {
                stack.push(curr);
                curr = curr.left;
            }
            else
            {
                TreeNode temp = stack.peek().right;
                if(temp == null)
                {
                    temp = stack.pop();
                    l.add(temp.val);
                    while(!stack.isEmpty() && temp == stack.peek().right)
                    {
                        temp = stack.pop();
                        l.add(temp.val);
                    }
                }
                else
                    curr = temp;   
            }
        }

        return l;
    }
}