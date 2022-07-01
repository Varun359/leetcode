class Solution {
    // public int coinChangeHelper(int dp[][], int coins, int amount,int numOfCoins)
    // {
    //     if(dp[])
    // }
    public int coinChange(int[] coins, int amount) {
        
        int m = coins.length;
        int n = amount;
        int dp[][]= new int[m+1][n+1];
        int i,j;
        for(i=1;i<amount+1;i++)
            dp[0][i] = amount+1;
        for(i=1;i<m+1;i++)
        {
            for(j=1;j<amount+1;j++)
            {
                if(j<coins[i-1]){
                    dp[i][j] = dp[i-1][j];
                }
                else{
                    dp[i][j] = Math.min(dp[i-1][j], 1+ dp[i][j-coins[i-1]]);
                }
            }
        }
        if(dp[m][n]==amount+1)
            return -1;
        return dp[m][n]; 
       
    }
}