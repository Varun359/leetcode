class Solution {
    public int longestOnes(int[] nums, int k) {
        
        Queue<Integer> q = new LinkedList();
        int i = 0,j =0;
        int result = 0;
        while(i < nums.length)
        {
            if(nums[i] == 0)
                q.offer(i);
            if(q.size() == k+1)
            {
                j = q.poll()+1;
            }
        
            result = Math.max(result, i-j+1);
            i++;
           
        }
        return result;
    }
}