class Solution {
    
    public int atleastNum(int nums[], int k)
    {
          int res = 0, i = 0, n = nums.length;
        for (int j = 0; j < n; j++) {
            k -= nums[j] % 2;
            while (k < 0)
            {   
                k += nums[i++] % 2;
            }
            
            res += j - i + 1;
           
        }
        return res;
    }
    public int numberOfSubarrays(int[] nums, int k) {
        return atleastNum(nums, k) - atleastNum(nums, k -1);
    }
}