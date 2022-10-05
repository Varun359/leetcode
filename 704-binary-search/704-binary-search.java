class Solution {
    public int search(int[] nums, int target) {
        int idx = -1;
        int low = 0, high = nums.length-1;
        while(low<=high)
        {
            int mid = low + (high-low)/2;
            if(nums[mid] == target)
            {
                idx = mid;
                break;
            }
            else if(nums[mid] > target)
            {
                high = mid-1;
            }
            else
                low = mid + 1;
        }
        return idx;
    }
}