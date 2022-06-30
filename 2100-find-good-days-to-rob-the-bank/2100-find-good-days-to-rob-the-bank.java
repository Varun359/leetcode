class Solution {
    public void beforeArray(int arr[], int sum[])
    {
       
        for(int i=0;i<arr.length;i++)
        {
            if(i==0)
            {    sum[i]=0;
                 continue;
            }
            else if(arr[i]<=arr[i-1])
            {
                sum[i]=sum[i-1]+1;
            }
            else
               sum[i]=0;
            
        }
    }
    public void afterArray(int arr[], int sum[])
    {
       
        for(int i=arr.length-1;i>=0;i--)
        {
            if(i==arr.length-1)
            {    sum[i]=0;
                 continue;
            }
            else if(arr[i]<=arr[i+1])
            {
                sum[i]=sum[i+1]+1;
            }
            else
               sum[i]=0;
            
        }
    }
    public List<Integer> goodDaysToRobBank(int[] security, int time) {
        
        int len=security.length;
        int afterSum[] = new int[len];
        int beforeSum[] = new int[len];
        beforeArray(security,beforeSum);
        afterArray(security,afterSum);
        List<Integer> l = new ArrayList<Integer>();
    
        for(int i=0;i<len;i++)
        {
          if(afterSum[i] >= time && beforeSum[i]>=time)
              l.add(i);
        } 
        return l;
    }
}