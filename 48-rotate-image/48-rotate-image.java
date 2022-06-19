class Solution {
    public void rotate(int[][] matrix) {
      int i,j,k;
      int n=matrix.length;
      for(i=0;i<n;i++)
      {
          for(j=0;j<i;j++)
          {
              swap(matrix,i,j);
          }
      }
        
      for(i=0;i<n;i++)
      {
          for(j=0;j<n/2;j++)
          {
            int t=matrix[i][j];
              matrix[i][j] = matrix[i][n-j-1];
              matrix[i][n-j-1]=t;
          }
      }
         
    }
    public void swap(int arr[][],int i,int j)
    {
        int t= arr[i][j];
        arr[i][j]=arr[j][i];
        arr[j][i]=t;
    }
}