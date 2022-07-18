import java.util.*;
class Solution {
    public int firstMissingPositive(int[] nums) {
        
        if(nums == null && nums.length == 0)
            return 0;
            
        PriorityQueue<Integer> pq = new PriorityQueue();
        
        for(int i=0;i<nums.length ; i++)
          pq.add(nums[i]);
        
        int i = 0, num =1;
        while(i<nums.length)
        {
            if(pq.poll() == num)
            {
                num++;
            }
            i++;
        }
        return num;
        
    }
}