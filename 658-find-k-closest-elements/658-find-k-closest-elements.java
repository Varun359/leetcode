class Solution {
    class Pair{
        int key;
        int value;
        public Pair(int a, int b)
        {
            this.key = a;
            this.value = b;
        }
    }
    public class CustomComparator implements Comparator<Pair>{
        public int compare(Pair a, Pair b)
        {
            if(a.key == b.key)
                return b.value - a.value;
            return b.key - a.key;
        }
    }
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        
        PriorityQueue<Pair> pq = 
                              new PriorityQueue<>(new CustomComparator());
        for(int i = 0;i<k;i++)
        {
            int diff = Math.abs(arr[i] - x);
            pq.add(new Pair(diff,arr[i]));
        }
      
        for(int i = k;i<arr.length;i++)
        {
            int diff = Math.abs(arr[i] - x);
            if(pq.peek().key > diff)
            {
                pq.poll();
                pq.add(new Pair(diff,arr[i]));
            }
        }
        List<Integer> l = new ArrayList();
        for(int i = 0;i<k;i++)
        {
            l.add(pq.poll().value);
        }
        Collections.sort(l);
        return l;
        
        
    }
}