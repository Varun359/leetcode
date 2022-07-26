class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
    
         if(image == null || image.length == 0)
             return new int[0][0];
        
         if(image[sr][sc] != color)
            dfs(image, sr, sc , color, image[sr][sc]);
        
         return image;
        
    }
    
    public void dfs(int image[][], int sr,int sc, int color, int original_color)
    {
        if(sr<0 || sr>=image.length || sc<0 || sc>=image[0].length || image[sr][sc] != original_color)
            return;
         image[sr][sc] = color;
         dfs(image, sr-1, sc, color, original_color);
         dfs(image, sr+1, sc, color, original_color);
         dfs(image, sr, sc+1, color, original_color);
         dfs(image, sr, sc-1, color, original_color);
        
    }
}