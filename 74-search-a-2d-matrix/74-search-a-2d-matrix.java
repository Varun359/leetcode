class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        if(matrix.length == 0 || matrix == null)
            return false;
        int len = (matrix.length * matrix[0].length);
        int low = 0, high = len-1;
        int mid;
        int row_length = matrix[0].length;
        while(low<=high)
        {
            mid = low + (high-low)/2;
            int ele = matrix[mid/row_length ][mid%row_length];
           
            if(ele == target)
            {
                return true;
            }
            else if(ele > target)
            {
                high = mid -1;
            }
            else
                low = mid+1;
        }
        
        return false;
    }
}