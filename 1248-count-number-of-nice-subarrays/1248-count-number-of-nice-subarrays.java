class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int count  = 0;
        int odd_count = 0;
        int j = 0;
        int res = 0;
        for(int i =0;i<nums.length;i++)
        {
            if(nums[i] % 2 != 0)
            {    odd_count++;
                 count = 0;
            }
        
             while(odd_count == k)
             {
                 if(nums[j++]%2 == 1)
                     odd_count--;
                  count++;
             }
            res += count;
            
        }
        return res;
        
      
    }
}