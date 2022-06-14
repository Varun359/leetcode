class Solution {
    public void setZeroes(int[][] matrix) {
        
        int i,j;
        int dup[][] = new int[matrix.length][matrix[0].length];
        for(i=0;i<matrix.length;i++)
         for(j=0;j<matrix[0].length;j++)
            dup[i][j] = matrix[i][j];
      
        for(i=0;i<dup.length;i++)
        {
            for(j=0;j<dup[0].length;j++)
            {
                if(dup[i][j]==0)
                {  
                   for(int k=0;k<dup[0].length;k++)
                     matrix[i][k]=0;
                   for(int h=0;h<dup.length;h++)
                     matrix[h][j]=0;
                }
            }
        }
        
    }
}