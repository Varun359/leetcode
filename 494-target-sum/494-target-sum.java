class Solution {
    Integer dp[][];
    public int findWays(int nums[], int n, int target)
    {
       if(n==0 && target == 0)
           return 1;
       if(n==0 && target!=0)
           return 0;
        
       if(dp[n][target] != null)
           return dp[n][target];
        
       if(nums[n-1] <= target)
        return dp[n][target] = findWays(nums, n-1,target - nums[n-1])+ findWays(nums, n-1,target);          
        else
        return dp[n][target] = findWays(nums, n-1, target);
        
    }
    public int findTargetSumWays(int[] nums, int target) {
       int i,j;
       int sum=0;
       for(i=0;i<nums.length;i++)
           sum+=nums[i];
      
       float f = (float) (sum+target)/2;
       System.out.println(f);
       int t = (int)f;
       if(f-t > 0)
           return 0;
        System.out.println(t);
        t = Math.abs(t);
        dp = new Integer[nums.length+1][t+1];
       for(i=1;i<t+1;i++)
           dp[0][i] = 0;
       dp[0][0] = 1;
       // for(j=0;j<nums.length+1;j++)
       //     dp[j][0] = 1;
       // int z_count =0;
       // for(i=0;i<nums.length;i++)
       //     if(nums[i] == 0)
       //         z_count++;
       // int z_fill=0;
       // System.out.println(z_count);
       // for(i=0;i<nums.length;i++)
       // {
       //     if(z_fill==z_count)
       //         break;
       //     if(nums[i]==0)
       //     {
       //         dp[i][0] = (int) Math.pow(2,z_fill);
       //         System.out.println(dp[i][0]);
       //         z_fill++;
       //     }
       // }
       return findWays(nums,nums.length,t);
    }
}