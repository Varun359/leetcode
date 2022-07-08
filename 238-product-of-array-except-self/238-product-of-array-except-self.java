class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        if(nums==null || nums.length ==0 )
            return new int[0];
        int prod[] = new int[nums.length];
        int i;
        prod[0] = 1;
        for(i=1;i<nums.length;i++)
            prod[i] = prod[i-1]*nums[i-1];
        
        int temp = 1;
        for(i=nums.length-1;i>=0;i--)
        {
            prod[i] = prod[i]*temp;
            temp*= nums[i];
        }
        return prod;
    }
}