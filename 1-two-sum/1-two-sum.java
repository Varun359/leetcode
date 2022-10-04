class Solution {
    public int[] twoSum(int[] nums, int target) {
        int j =-1, i =-1;
        Map<Integer, ArrayList<Integer>> hm = new HashMap();
        
        for(i = 0;i<nums.length;i++)
        {
            if(!hm.containsKey(nums[i]))
              hm.put(nums[i], new ArrayList());
              hm.get(nums[i]).add(i);
        }
       
        for(i = 0;i<nums.length;i++)
        {
            int ch = 0;
            if(hm.containsKey(target - nums[i]))
            {
                ArrayList<Integer> l = hm.get(target - nums[i]);
                for(int idx : l)
                {
                    if(idx != i)
                    {
                      j = idx;
                      ch = 1;
                      break;
                    }
                        
                }    
                
                if(ch == 1)
                  break;
            }
        }
        
        return new int[]{i,j};
    }
}