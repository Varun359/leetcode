class Solution {
    public void rotate(int[][] matrix) {
      int i,j,k;
      int n=matrix.length;
      int arr[][]=new int[n][n];
      for(i=0;i<n;i++)
      {   k=n-1;
          for(j=0;j<n;j++)
         {
          arr[i][j] = matrix[k][i]; 
          k--;
         }
      }
        
      for(i=0;i<n;i++)
      for(j=0;j<n;j++)
        matrix[i][j] = arr[i][j];
         
    }
}