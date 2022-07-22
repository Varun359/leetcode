class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        
        int arr[] = new int[nums.length];
        
        int left = 0;
        int right = nums.length -1;
        
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i] < pivot)
              arr[left++] = nums[i];
            if(nums[nums.length - i -1] > pivot)
              arr[right--] = nums[nums.length - i -1];
        }
    
        while(left <= right)
        {
            arr[left++] = pivot;
        }
        return arr;
        
    }
}