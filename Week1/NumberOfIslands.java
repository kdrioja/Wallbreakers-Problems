// 1 - land
// 0 - water

class Solution {
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }
        
        int rows = grid.length, cols = grid[0].length, islands = 0;
        
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (grid[r][c] == '1') {
                    islands++;
                    DFS(grid, r, c);
                }
            }
        }
        
        return islands;
    }
    
    public void DFS(char[][] grid, int r, int c) {
        int rows = grid.length, cols = grid[0].length;
        
        if (r < 0 || c < 0 || r >= rows || c >= cols || grid[r][c] == '0') {
            return;
        }
        
        grid[r][c] = '0';
        
        DFS(grid, r, c + 1);
        DFS(grid, r, c - 1);
        DFS(grid, r + 1, c);
        DFS(grid, r - 1, c);
    }
}