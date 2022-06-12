class Solution {
    public int maximumUniqueSubarray(int[] nums) {
     
        Set<Integer> s = new HashSet();
        int i=0,j=0;
        int currSum=0, max=-1;
        while(i<nums.length && j<nums.length)
        {
            if(s.contains(nums[i]) != true)
            {   s.add(nums[i]);
                currSum+= nums[i++];
                max = currSum>max ? currSum : max;
            }
            else
            {
               
                 currSum-= nums[j];
                 s.remove(nums[j++]);
            }
            
        }
        return max;
    }
}