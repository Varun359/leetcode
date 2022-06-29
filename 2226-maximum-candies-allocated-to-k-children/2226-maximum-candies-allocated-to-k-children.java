class Solution {
    public boolean candyCount(int[] arr, int n, long k)
    {
        long count=0;
        if(n==0)
            return true;
        for(int i=0;i<arr.length;i++)
        {
            count+=arr[i]/n;
            if(count>=k)
              return true;
        }
        return false;
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
            mid  = l+(h-l)/2;
            if(candyCount(candies,mid,k))
                l = mid+1;
            else
                h = mid;
        }
        return candyCount(candies,l,k) ? l :  l-1;       
    }
}