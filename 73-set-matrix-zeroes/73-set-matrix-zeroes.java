class Solution {
    public void setZeroes(int[][] matrix) {
        
        int i,j,l=0;
        int dup[] = new int[matrix.length*matrix[0].length];
        for(i=0;i<matrix.length;i++)
         for(j=0;j<matrix[0].length;j++)
            dup[l++] = matrix[i][j];
      
        l=0;
        for(i=0;i<matrix.length;i++)
        {
            for(j=0;j<matrix[0].length;j++)
            {
                if(dup[l++]==0)
                {  
                   for(int k=0;k<matrix[0].length;k++)
                     matrix[i][k]=0;
                   for(int h=0;h<matrix.length;h++)
                     matrix[h][j]=0;
                }
            }
        }
        
    }
}