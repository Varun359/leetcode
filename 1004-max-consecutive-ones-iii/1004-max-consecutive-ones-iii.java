class Solution {
    public int longestOnes(int[] nums, int k) {
        
        int result = 0, i =0,j=0;
        int KUsed = 0;
        int oneCounts = 0;
        while(i<nums.length)
        {
            if(nums[i] == 1)
            {  oneCounts++;
               i++;
            }
            else
            {
                if(KUsed < k)
                {
                    KUsed++;
                    oneCounts++;
                    i++;
                }
                else if(k > 0)
                {
                    while(j<i && KUsed == k)
                    {
                        if(nums[j] == 0)
                           KUsed--;
                        j++;
                        oneCounts--;
                    }
                }
                else
                {   i++;
                    oneCounts = 0;
                }
            }
            result = Math.max(oneCounts, result);
       
        }
        
        return result;
    }
}