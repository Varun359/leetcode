class Solution {
    public int minOperations(int[] nums, int x) {
      int i,sum=0;
      for(i=0;i<nums.length;i++)
      {
          sum+=nums[i];
      }
      int l=0,r=0,currSum=0,maxLength=-1;
      for(l=0,r=0;r<nums.length;r++)
      {
          currSum+=nums[r];
          while(l<=r && currSum>sum-x) 
              currSum-=nums[l++];
          if(currSum == sum-x)
              maxLength = Math.max(maxLength, r-l+1);
      }
      return maxLength == -1 ? -1 : nums.length-maxLength;
    }
}