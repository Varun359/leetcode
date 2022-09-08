class Solution {
    public int jump(int[] nums) {
        
        int currEnd = 0, currMax = 0,jumps= 0;
        for(int i =0;i<nums.length-1;i++)
        {
            currMax = Math.max(currMax, i+nums[i]);
            if(i == currEnd)
            {
                jumps++;
                currEnd = currMax;
            }
        }
        return jumps;
    }
}