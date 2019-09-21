class Solution {
    public int[][] transpose(int[][] A) {
        int row = A.length, col = A[0].length;//, row2 = col1, col2 = row1;
        int[][] result = new int[col][row];
        
        for (int c = 0; c < col; c++) {
            for (int r = 0; r < row; r++) {
                result[c][r] = A[r][c];
            }
        }
        
        return result;
    }
}