class Solution {
    public int findPeakElement(int[] nums) {
        int i;
        if(nums.length == 1)
            return 0;
        int start=0,end=nums.length-1;
        int mid=0;
        while(start<end)
        {
            mid=(start+end)+1/2;
            if(mid==0 && nums[0]>nums[1])
                return 0;
            if(mid==nums.length-1 && nums[mid]>nums[mid-1])
                return mid;
                
            if(nums[mid] > nums[mid-1] && nums[mid]>nums[mid+1])
                return mid;
            if(nums[mid]<nums[end])
                start=mid+1;
            else
                end=mid-1;
        }
        return start;
    }
}