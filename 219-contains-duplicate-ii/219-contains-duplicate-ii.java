class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
       int i,j;
       int len = nums.length;
       Map<Integer, ArrayList<Integer>> hm = new HashMap();
        
       for(i = 0;i<len;i++)
       {
           if(hm.containsKey(nums[i]))
           {
               ArrayList<Integer> l = hm.get(nums[i]);
               for(int ele : l)
               {
                   if(Math.abs(i - ele) <= k)
                       return true;
               }
               hm.get(nums[i]).add(i);
           }
           else
           {
               hm.put(nums[i] , new ArrayList());
               hm.get(nums[i]).add(i);
           }
       }
        return false;
        
    }
}