class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
       int i,j;
       int len = nums.length;
       Map<Integer, Integer> hm = new HashMap();
        
       for(i = 0;i<len;i++)
       {
           if(hm.containsKey(nums[i]))
           {
               int ele = hm.get(nums[i]);
               if(Math.abs(i - ele) <= k)
                       return true;
               hm.remove(nums[i]);
               hm.put(nums[i], i);
           }
           else
           {
              hm.put(nums[i],i);
           }
       }
        return false;
        
    }
}