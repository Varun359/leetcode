class Solution {
    public int[] rearrangeArray(int[] nums) {
     
        int pos[] = new int[nums.length/2];
        int neg[] = new int[nums.length/2];
        
        int p = 0, n = 0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i] < 0)
                neg[n++] = nums[i];
            else
                pos[p++] = nums[i];
        }

        p = 0;
        n = 0;
        int ch = 0;
        for(int i=0;i<nums.length;i++)
        {
            if(ch == 0)
            {
                nums[i] = pos[p++];
                ch = 1;
            }
            else
            {
                nums[i] = neg[n++];
                ch = 0;
            }
        }
        return nums;
    }
}