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

//striver
class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
         Map<Integer, Integer> hm = new HashMap();
        int j = 0;
        for(int i : inorder)
            hm.put(i, j++);
        
        return convert(postorder, 0 , postorder.length - 1, inorder, 0, inorder.length - 1, hm);
    
    }
    
    public TreeNode convert(int[] postorder, int postStart, int postEnd, int[] inorder, int inStart, int inEnd, Map<Integer, Integer> hm)
    {
        if(postStart > postEnd || inStart > inEnd)
            return null;
        TreeNode root = new TreeNode(postorder[postEnd]);
        int val = hm.get(root.val);
        int numsleft = val - inStart;
        
        root.left = convert(postorder, postStart , postStart+numsleft-1, inorder, inStart, val-1 , hm );
        root.right = convert(postorder, postStart+numsleft , postEnd - 1, inorder, val+1, inEnd, hm);
        return root;
    }
}