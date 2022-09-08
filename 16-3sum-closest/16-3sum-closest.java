class Solution {

    public int threeSumClosest(int[] nums, int target) {
     
         int i,start,end;
         int res_sum = nums[0]+nums[1]+nums[nums.length-1];
         Arrays.sort(nums);
       
         for(i = 0;i<nums.length-2;i++)
         {
             start = i+1;
             end = nums.length-1;
             while(start<end)
             {
                 int sum = nums[i]+nums[start]+nums[end];
                 if(sum >target)
                     end--;
                 else
                     start++;
                 if(Math.abs(sum - target) < Math.abs(res_sum - target))
                     res_sum = sum;
             }
         }
        return res_sum;
    }
}