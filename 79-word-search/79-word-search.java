class Solution {
    int m,n;
    int dirs[][];
    public boolean exist(char[][] board, String word) {
        if(board == null || board.length == 0)
            return false;
        
        dirs = new int[][] {{-1,0}, {1,0}, {0,1}, {0,-1}};
        m = board.length;
        n = board[0].length;
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++)
            {
                if(backtrack(board,word,i,j,0))
                {
                    return true;
                }
            }
        }
        return false;
    }
    
    public boolean backtrack(char[][] board, String word, int r, int c, int index)
    {
        if(index == word.length())
            return true;
        if(r<0 || r==m || c<0 || c==n || board[r][c] == '#')
            return false;
        if(word.charAt(index) == board[r][c])
        {
            char ch = board[r][c];
            board[r][c] = '#';
            
                for(int dir[] : dirs)
                {
                  int row = r+dir[0];
                  int col = c+dir[1];
                   if(backtrack(board, word, row, col, index+1))
                       return true;
                }
              board[r][c] = ch;            
        }
        return false;
    }
}