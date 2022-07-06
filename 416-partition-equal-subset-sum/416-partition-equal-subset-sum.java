class Solution {
    Boolean dp[][];
    public boolean recursiveHelper(int nums[], int l, int sum)
    {
        if(sum==0)
            return true;
        if(l==0 && sum!=0)
            return false;
        
        if(dp[l][sum] != null)
            return dp[l][sum];
        
        if(nums[l-1] <= sum)
         return dp[l][sum] = recursiveHelper(nums,l-1,sum-nums[l-1]) || recursiveHelper(nums, (l-1), (sum));
        else
         return dp[l][sum] = recursiveHelper(nums,l-1,sum);
    }
    
    public boolean canPartition(int[] nums) {
        int i,j,sum=0;
        for(i=0;i<nums.length;i++)
           sum+=nums[i];
        if(sum%2==1)
            return false;
        sum/=2;
        dp= new Boolean[nums.length+1][sum+1];
        for(i=1;i<sum+1;i++)
         dp[0][i] = false;
        for(j=0;j<nums.length+1;j++)
         dp[j][0] = true;
        
      
         return recursiveHelper(nums, nums.length, sum);
       
    }
}