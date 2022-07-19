class Solution {

    public int numOfPairs(String[] nums, String target) {
       
      Map<String, Integer> hm = new HashMap();
     
      for(int i=0;i<nums.length;i++)
          hm.put(nums[i], hm.getOrDefault(nums[i],0)+1);
      
      int res = 0;
      for(int i=1;i<target.length();i++)
      {
          String s = target.substring(0,i);
          String t = target.substring(i,target.length());
          
          if(hm.containsKey(s) && hm.containsKey(t))
          {
              if(s.equals(t))
                res += hm.get(s) * (hm.get(s)-1);
              else
                res += hm.get(s) * hm.get(t);
          }
          
      }
        return res;
    }
}