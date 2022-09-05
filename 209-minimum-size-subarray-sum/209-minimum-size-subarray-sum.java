class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        
        int sum = 0;
        int j = 0;
        int count = 0;
        int result = Integer.MAX_VALUE;
        for(int i = 0;i<nums.length;i++)
        {
            sum += nums[i];
            count++;
           
            while(sum>=target)
            {
                //System.out.println(sum);
                result = Math.min(result, count);
                sum -= nums[j++];
                count--;
                if(sum>=target)
                    result = Math.min(result, count);
            }          
        }
        //System.out.println(j+" "+result);
        for(int i = j;i<nums.length;i++)
        {
            if(sum>=target)
            {
                result = Math.min(result, count);
                sum-=nums[i];
                count--;
            }
         
        }
        if(result == Integer.MAX_VALUE)
            return 0;
        return result;
    }
}