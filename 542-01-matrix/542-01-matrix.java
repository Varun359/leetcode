public class Solution {
    public int[][] updateMatrix(int[][] matrix) {
     
        if(matrix == null || matrix.length == 0)
            return new int[0][0];
        
        Queue<Integer> row = new LinkedList();
        Queue<Integer> col = new LinkedList();
        
        int dirs[][] = {{0,1},{1,0},{-1,0},{0,-1}};
        
        for(int i=0;i<matrix.length;i++)
         for(int j=0;j<matrix[0].length;j++)
         {
             if(matrix[i][j] == 0)
             {
                 row.add(i);
                 col.add(j);
             }
             else
                 matrix[i][j] = -1;
         }
        
        while(!row.isEmpty())
        {
            int r = row.poll();
            int c = col.poll();
            for(int dir[] : dirs)
            {
                int ro = r+dir[0];
                int co = c+dir[1];
                
                if(ro<0 || ro>=matrix.length || co<0 || co>=matrix[0].length || matrix[ro][co] != -1)
                continue;
           
                matrix[ro][co] = matrix[r][c] + 1;
                row.add(ro);
                col.add(co);
           
            }
           
        }
        return matrix;
    }
}