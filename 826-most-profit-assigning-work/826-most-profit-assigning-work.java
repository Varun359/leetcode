class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        
        int i,j;
        int sum =0;
        for(i = 0;i < worker.length; i++)
        {
            int s = 0;
            for(j=0; j<difficulty.length;j++)
            {
              if(difficulty[j] <= worker[i])
              {
                  if(s<profit[j])
                   s = profit[j];
              }
            }
            sum+= s;
        }
        return sum;
    }
}