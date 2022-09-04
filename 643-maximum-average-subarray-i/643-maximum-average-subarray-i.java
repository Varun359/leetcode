class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double result;
        int sum = 0;
        int temp[] = new int[k];
        if(nums.length < k)
            return 0;
        for(int i = 0;i<k;i++)
        {
            temp[i] = nums[i];
            sum+=nums[i];
        }
        result = (double) sum/k;
        for(int i = k;i<nums.length;i++)
        {
             sum -= nums[i-k];
             temp[i%k] = nums[i];
             sum+= nums[i];
            
             double avg = (double) sum /k;
             if(avg > result)
                 result = avg;
        }
        return result;
    }
}