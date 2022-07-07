class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> hm = new HashSet();
        int i;
        int count=0;
        int n = candyType.length/2;
        for(i=0;i<candyType.length;i++)
        {
            if(hm.contains(candyType[i]))
                continue;
            else
            { hm.add(candyType[i]);
              count++;
              if(count == n)
              break;
            }
        }
        
        if(count<n)
            return count;
        return n;
    }
}