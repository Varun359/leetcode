class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        if(nums==null || nums.length ==0 )
            return new int[0];
        int prefix_prod[] = new int[nums.length];
        int suffix_prod[] = new int[nums.length];
        
        int i;
        prefix_prod[0] = 1;
        for(i=1;i<nums.length;i++)
        {
            prefix_prod[i] = prefix_prod[i-1]*nums[i-1];
        }
    
        suffix_prod[nums.length-1] = 1;
        for(i=nums.length-2;i>=0;i--)
        {
            suffix_prod[i] = suffix_prod[i+1] * nums[i+1];
        }
    
        for(i=0;i<nums.length;i++)
        {
         nums[i] = prefix_prod[i] * suffix_prod[i];   
        }
        
        return nums;
    }
}