class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
    
         if(image == null || image.length == 0)
             return new int[0][0];
        
         if(image[sr][sc] == color)
             return image;
         
         Queue<Integer> row = new LinkedList<Integer>();
         Queue<Integer> col = new LinkedList();
         int m = image.length;
         int n = image[0].length;
         
         int dirs[][] = {{-1,0},{0,-1},{1,0},{0,1}};
         int original_color = image[sr][sc];
         row.add(sr);
         col.add(sc);
         image[sr][sc] = color;
         while(!row.isEmpty())
         {
             int r = row.poll();
             int c = col.poll();
             for(int dir[] : dirs)
             {
                 int curr_row = dir[0] + r;
                 int curr_col = dir[1] + c;
                 if(curr_row>=0 && curr_row<m && curr_col>=0 && curr_col<n && image[curr_row][curr_col] == original_color)
                 {
                     row.add(curr_row);
                     col.add(curr_col);
                     image[curr_row][curr_col] = color;
                 } 
             }
         }
        
         return image;
        
         
         
        
    }
}