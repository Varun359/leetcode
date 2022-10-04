class Solution {
    public int[] twoSum(int[] nums, int target) {
        int j =-1, i =-1;
        Map<Integer, Integer> hm = new HashMap();
        
        for(i = 0;i<nums.length;i++)
        {
            if(hm.containsKey(target - nums[i]))
            {
                j = hm.get(target - nums[i]);
                break;
            }
            hm.put(nums[i], i); 
        }
       
     
        return new int[]{i,j};
    }
}