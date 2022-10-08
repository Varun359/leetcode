class Solution {
    public int majorityElement(int[] nums) {
          if(nums == null || nums.length == 0)
              return 0;
          int count = 1;
          int major = nums[0];
          for(int i= 1;i<nums.length;i++)
          {
              if(nums[i] == major)
                 count ++;
              else
                  count --;
              if(count == 0)
                  major = nums[i+1];
          }
        return major;
    }
}