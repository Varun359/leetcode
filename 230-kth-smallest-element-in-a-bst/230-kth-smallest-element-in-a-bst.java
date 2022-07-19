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
    int arr[];
    public int kthSmallest(TreeNode root, int k) {
        
        if(root == null)
            return 0;
        if(root.left == null && root.right == null && k==1)
            return root.val;
        arr = new int[10000];
        
        for(int i=0;i<10000;i++)
            arr[i] = -1;
        findAllValues(root); 
        
        int j = 0;
        int index = 0;
        for(int i=0;i<10000;i++)
        {
            if(arr[i] != -1)
            {  j++;
               if(j == k)
                   break;
            }
             index++; 
           
        }
        if(j!=0)
          return arr[index];
        return 0;
    }
    
    public void findAllValues(TreeNode root)
    {
        if(root == null)
            return;
        findAllValues(root.left);
        findAllValues(root.right);
        arr[root.val] = root.val;
    }
}