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

//Morris traversal Striver

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        
        List<Integer> l = new ArrayList();
        if(root == null)
         return l;
        while(root!=null)
        {
            
            if(root.left == null)
            {
                l.add(root.val);
                root = root.right;
            }
            else
            {
                TreeNode prev = root.left;
                while(prev.right!=null && prev.right!=root)
                    prev = prev.right;
                
                if(prev.right == null)
                {
                        prev.right = root;
                        root = root.left;
                }
                else 
                 {
                     prev.right = null;
                     l.add(root.val);
                     root = root.right;
                 }
                }
            }

        
        return l;
    }
    
}