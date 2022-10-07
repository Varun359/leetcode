class Solution {
    int grid[][];
//     public int allPossiblePaths(int i,int j, int m,int n)
//     {
//         if(i == m-1 && j == n-1)
//             return 1;
//         if(dp[i][j] != -1)
//             return dp[i][j];
        
//         return dp[i][j] = allPossiblePaths(i+1,j,m,n) + allPossiblePaths(i,j+1,m,n);
//     }
    public int uniquePaths(int m, int n) {
        grid = new int[102][102];
        for(int i =0;i<m;i++)
        for(int j =0;j<n;j++)
        {
            if(i == 0 || j == 0)
                grid[i][j] = 1;
            else
                grid[i][j] = grid[i-1][j]+grid[i][j-1];
        }
       return grid[m-1][n-1];
    }
}
/*
public class Solution {
public int uniquePaths(int m, int n) {
    int[][] grid = new int[m][n];
    for(int i = 0; i<m; i++){
        for(int j = 0; j<n; j++){
            if(i==0||j==0)
                grid[i][j] = 1;
            else
                grid[i][j] = grid[i][j-1] + grid[i-1][j];
        }
    }
    return grid[m-1][n-1];
}
}*/