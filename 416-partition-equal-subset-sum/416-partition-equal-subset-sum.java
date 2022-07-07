class Solution {
    public boolean canPartition(int[] nums) {
        int i,j,sum=0;
        for(i=0;i<nums.length;i++)
           sum+=nums[i];
        if(sum%2==1)
            return false;
        sum/=2;
        boolean dp[][] = new boolean[nums.length+1][sum+1];
        
        for(i=1;i<sum+1;i++)
         dp[0][i] = false;
        for(j=0;j<nums.length+1;j++)
         dp[j][0] = true;
        
        for(i=1;i<nums.length+1;i++)
         for(j=1;j<sum+1;j++)
         {
             if(nums[i-1]<=j)
                 dp[i][j] = dp[i-1][j-nums[i-1]] || dp[i-1][j];
             else
                 dp[i][j] = dp[i-1][j];  
         }
        return dp[nums.length][sum];
    }
}