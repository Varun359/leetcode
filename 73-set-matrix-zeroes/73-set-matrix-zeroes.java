class Solution {
    public void setZeroes(int[][] matrix) {
        
        int i,j;
        int dup[][] = new int[matrix.length][matrix[0].length];
        for(i=0;i<matrix.length;i++)
         for(j=0;j<matrix[0].length;j++)
            dup[i][j] = matrix[i][j];
        
        Set<Integer> si = new HashSet();
         Set<Integer> sj = new HashSet();
        for(i=0;i<dup.length;i++)
        {
            for(j=0;j<dup[0].length;j++)
            {
                if(dup[i][j]==0)
                {  
                   si.add(i);
                   sj.add(j);
                }
            }
        }
        
        for(i=0;i<dup.length;i++)
        {
            for(j=0;j<dup[0].length;j++)
            {
                if(si.contains(i) || sj.contains(j))
                    matrix[i][j]=0;
            }
        }
    }
}