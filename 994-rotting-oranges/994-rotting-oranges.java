class Solution {
    public int orangesRotting(int[][] grid) {
        int fresh = 0;
        Queue<int[]> q = new LinkedList();
        int dirs[][] = {{1,0},{0,1},{0,-1},{-1,0}};
        
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j] == 1)
                   fresh++;
                else if(grid[i][j] == 2)
                {
                    q.add(new int[]{i,j});
                }
            }
        }
        
        if(fresh == 0)
            return 0;
        
        int time = 0;
        
        while(!q.isEmpty())
        {
            int size = q.size();
            for(int i=0;i<size;i++)
            {
                int arr[] = q.poll();
                for(int dir[] : dirs)
                {
                   int rn = arr[0] + dir[0];
                   int cm = arr[1] + dir[1];
                
                   if(rn>=0 && rn<grid.length && cm>=0 && cm<grid[0].length && grid[rn][cm] == 1){
                       fresh--;
                       q.add(new int[] {rn,cm});
                       grid[rn][cm] = 2;
                   }
                }
            }
            time++;
        }
        
        if(fresh == 0)
            return time-1;
        return -1;
    }
}