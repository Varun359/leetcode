class Solution {
    public int findMin(int[] nums) {
        int i;
        if(nums.length == 1)
            return nums[0];
        int start=0, end=nums.length-1;
        int mid=0;
        while(start<end)
        {
            mid = (start+end)/2+1;
            if(nums[mid]<nums[mid-1])
                return nums[mid];
            if(nums[mid]>nums[end])
                start=mid+1;
            else
                end=mid-1;
        }
        return nums[start];
    }
}