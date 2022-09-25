class Solution {
    public int[] topKFrequent(int[] nums, int k) {
    
        Map<Integer, Integer> hm = new HashMap();
        for(int i = 0;i<nums.length;i++)
        {
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        
        PriorityQueue<Map.Entry<Integer,Integer>> pq = new PriorityQueue<>((a,b) -> (a.getValue() - b.getValue()));
        
        for(Map.Entry<Integer,Integer> entry : hm.entrySet())
        {
            pq.add(entry);
            if(pq.size() > k)
                pq.poll();
        }
        
        int res[] = new int[k];
        for(int i = 0;i<k;i++)
        {
            Map.Entry<Integer,Integer> ele = pq.poll();
            res[i] = ele.getKey();
        }
    
        return res;
        
        
    }
}