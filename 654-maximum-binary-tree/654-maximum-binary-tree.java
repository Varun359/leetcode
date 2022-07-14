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
    
    // public int binarySearch(int nums[], int low,int high){
    // { 
    //     int max = 0;
    //     int maxindex = -1;
    //     while(low<=high)
    //     {
    //        if(nums[low] > max)
    //            max = nums[low++];
    //            maxIndex =.low;
    //     }
    //     return max;
    // }
    public TreeNode constructTree(int nums[], int low, int high)
    {
        if(low == high)
            return null;
        int max = nums[low];
        int maxIndex = low;
        int i = low+1;
        while(i<high)
        {
           if(nums[i] > max)
           { 
               max = nums[i];
               maxIndex = i;
           }
            i++;
        }
       
        TreeNode t = new TreeNode(max);
        t.left = constructTree(nums, low, maxIndex);
        t.right = constructTree(nums, maxIndex+1, high);
        return t;
    }
    public TreeNode constructMaximumBinaryTree(int[] nums) {
      
        return constructTree(nums,0, nums.length);
    }
}