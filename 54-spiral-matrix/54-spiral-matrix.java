class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
     if(matrix==null || matrix.length==0)
         return new ArrayList();
     int row_begin=0;
     int row = matrix.length-1;
     int col_begin=0;
     int col = matrix[0].length-1;
    
     int i=0,j=0;
     List<Integer> li = new ArrayList();

     while(row_begin<=row && col_begin<=col)
     {
        for(i=col_begin;i<=col;i++)
        {
            li.add(matrix[row_begin][i]);
        }
        row_begin++;
      
        for(i=row_begin;i<=row;i++)
        {
            li.add(matrix[i][col]);
        }
       col--;
        
        if(row_begin<=row)
        {
            for(i=col;i>=col_begin;i--)
            {
                li.add(matrix[row][i]);
            }
            row--;
             
        }
         
        if(col_begin<=col)
        {
            for(i=row;i>=row_begin;i--)
            {
                li.add(matrix[i][col_begin]);
            }
            col_begin++;
             
        }
         
     }
      return li;
        
    }
}