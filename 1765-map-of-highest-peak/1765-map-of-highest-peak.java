class Solution {
    int directions[][] = new int[][]{{-1,0},{0,1},{1,0},{0,-1}};
    int row,col;
    public int[][] highestPeak(int[][] isWater) {
        row = isWater.length;
        col = isWater[0].length;
        int height[][] = new int[row][col];
        Queue<int[]> q = new LinkedList();
        for(int i=0;i<row;i++)
         for(int j=0;j<col;j++)
         {
             if(isWater[i][j] == 0)
               height[i][j] = -1;
             else
             {
                 height[i][j] = 0;
                 q.add(new int[]{i,j});
             }
         }
        
        makeheightArr(height, q);
        return height;
    }
    
    public void makeheightArr(int height[][], Queue<int[]> q)
    {
       while(!q.isEmpty())
       {
             int pos[] = q.remove();
              for(int dir[] : directions)
              {
               
                int i = pos[0] + dir[0];
                int j = pos[1] + dir[1];
                
                if(!isValid(i,j))
                   continue;
               
                if(height[i][j]!=-1)
                   continue;
             
                height[i][j] = height[pos[0]][pos[1]] + 1;
              
               
                q.add(new int[]{i,j});
              }
       }
       
    }
    public boolean isValid(int i,int j)
    {
        if(i>=0 && i<row && j>=0 && j<col)
            return true;
        return false;
    }
}