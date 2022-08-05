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
        
        int copy[] = new int[postorder.length];
        j = 0;
        for(int i = postorder.length - 1; i>=0 ;  i--)
            copy[j++] = postorder[i];
        return convert(copy, 0 , copy.length - 1, inorder, 0, inorder.length - 1, hm);
    
    }
    
    public TreeNode convert(int[] preorder, int preStart, int preEnd, int[] inorder, int inStart, int inEnd, Map<Integer, Integer> hm)
    {
        if(preStart > preEnd || inStart > inEnd)
            return null;
        TreeNode root = new TreeNode(preorder[preStart]);
        int val = hm.get(root.val);
        int numsleft = inEnd - val;
        
        root.right = convert(preorder, preStart+1, preStart+numsleft, inorder, val+1, inEnd, hm );
        root.left = convert(preorder, preStart+numsleft+1, preEnd, inorder, inStart, val-1, hm);
        return root;
    }
}