class Solution {
    // class Pair{
    //     int a;
    //     int b;
    //     public Pair(int a, int b)
    //     {
    //         this.a = a;
    //         this.b = b;
    //     }
    // }
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        
        PriorityQueue<Pair<Integer, Integer>> pq = 
                              new PriorityQueue<>((a, b) -> b.getKey() - a.getKey());
        for(int i = 0;i<k;i++)
        {
            int diff = Math.abs(arr[i] - x);
            pq.add(new Pair(diff,arr[i]));
        }
      
        for(int i = k;i<arr.length;i++)
        {
            int diff = Math.abs(arr[i] - x);
            if(pq.peek().getKey() > diff)
            {
                pq.poll();
                pq.add(new Pair(diff,arr[i]));
            }
        }
        List<Integer> l = new ArrayList();
        for(int i = 0;i<k;i++)
        {
            l.add(pq.poll().getValue());
        }
        Collections.sort(l);
        return l;
        
        
    }
}