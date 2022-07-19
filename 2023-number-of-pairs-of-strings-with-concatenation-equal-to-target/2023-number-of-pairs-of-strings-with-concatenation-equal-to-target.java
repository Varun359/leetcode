class Solution {

    public int numOfPairs(String[] nums, String target) {
       
        int count = 0;
        int len = nums.length;
        for(int i = 0;i < len;i++)
        {
            for(int j = i+1; j < len; j++)
            {
                String s = nums[i]+nums[j];
                if(s.compareTo(target) == 0)
                    count++;
                String t = nums[j]+nums[i];
                if(t.compareTo(target) == 0)
                    count++;
            }
        }
        
        return count;
    }
}