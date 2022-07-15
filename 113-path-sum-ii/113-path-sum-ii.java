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
    List<List<Integer>> res;
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        res = new ArrayList();
        if(root==null)
            return res;
        pathSumLists(root, 0, targetSum, new ArrayList());
        return res;
    }
    
    public void pathSumLists(TreeNode root, int currSum, int target, List<Integer> l)
    {
        if(root == null)
            return;
        currSum += root.val;
        // System.out.println(currSum);
        l.add(root.val);
        if(root.left == null && root.right == null)
        {
            if(currSum == target)
               res.add(new ArrayList<>(l));
        }
        pathSumLists(root.left, currSum, target, l);
        pathSumLists(root.right, currSum, target, l);
        
        l.remove(l.size()-1);
    }
}