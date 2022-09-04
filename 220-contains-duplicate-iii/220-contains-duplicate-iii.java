class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        if(nums.length == 0)
            return false;
        TreeSet<Long> ts = new TreeSet();
        for(int i = 0;i<nums.length;i++)
        {
             Long ele = (long) nums[i];
             
             Long ceil = ts.ceiling(ele);
             Long floor = ts.floor(ele);
            
             if(floor!=null &&  ele - floor  <= t)
                 return true;
             
             if(ceil!=null && ceil - ele <=t)
                 return true;
            
             ts.add(ele);
             if(ts.size() > k)
                 ts.remove((long)nums[i-k]);
        }
        return false;
    }
}