import java.util.*;
class Solution {
    public int firstMissingPositive(int[] nums) {
        
        if(nums == null && nums.length == 0)
            return 0;
            
        int i = 0;
        while(i<nums.length)
        {
            if(nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[nums[i] - 1])
               swap(nums, i , nums[i]-1);
            else
               i++;
        }
        
        for(i=0;i<nums.length;i++)
        {
            if(nums[i] != i+1)
                break;
        }
        return i+1;
    }
    
    public void swap(int arr[], int i, int j)
    {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}