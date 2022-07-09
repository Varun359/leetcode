class Solution {
    public int[][] generateMatrix(int n) {
        if(n==0)
            return new int[0][0];
        int arr[][]=new int[n][n];
        int i;
        int row_begin = 0;
        int row_end = n-1;
        int col_begin = 0;
        int col_end = n-1;
        int ele = 1;
        while(row_begin<=row_end && col_begin<=col_end)
        {
           for(i=col_begin;i<=col_end;i++)
             arr[row_begin][i] = ele++;
           row_begin++;
            
           for(i=row_begin;i<=row_end;i++)
             arr[i][col_end] = ele++;
           col_end--;
            
           for(i=col_end;i>=col_begin;i--)
             arr[row_end][i] = ele++;
           row_end--;
            
           for(i=row_end;i>=row_begin;i--)
             arr[i][col_begin] = ele++;
           col_begin++;
        }
        return arr;
    }
}