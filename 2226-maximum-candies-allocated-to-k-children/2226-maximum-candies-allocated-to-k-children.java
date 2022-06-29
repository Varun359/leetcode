class Solution {
    public long candyCount(int[] arr, int n)
    {
        long count=0;
        if(n==0)
            return 0;
       
        for(int i=0;i<arr.length;i++)
            count+=arr[i]/n;
        return count;
    }
    public int maximumCandies(int[] candies, long k) {
        
       
        int l=0,h=Integer.MIN_VALUE;
        int len=candies.length;
        int i;
        for(i=0;i<len;i++)
        {
            if(h<candies[i])
                h=candies[i];
        }
        int mid=0;
        while(l<h)
        {
            mid  = (h-l)/2+l;
            long count = candyCount(candies,mid);
            if(count>=k || count==0)
            {
                l = mid+1;
            }
            else
                h = mid;
        }
        if(l==0)
            return l;
        long r=candyCount(candies,l);
        return r==k ? l :  l-1;       
    }
}