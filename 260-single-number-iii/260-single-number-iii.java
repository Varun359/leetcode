class Solution {
    public int[] singleNumber(int[] nums) {
    
        int xor1 = 0;
        for(int i = 0;i<nums.length;i++)
        {
            xor1 ^= nums[i];
        }
        
        
        int temp = xor1 & (-xor1);
        
        int xor2 = 0;
        
        for(int i = 0;i<nums.length;i++)
        {
            if((temp & nums[i]) != 0)
                xor2 ^= nums[i];
        }
        
        return new int[]{ xor2, xor2^xor1};
    }
}