class Solution {
   
    public int closedIsland(int[][] grid) {
         int count = 0;
    int rows = grid.length;
    int cols = grid[0].length;
        for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {

            if (grid[i][j] == 0) {
                if (dfs(grid, i, j)) {
                    count++;
                }
            }

        }
    }

    return count;
    }
    public boolean dfs(int[][] grid,int i,int j){
        int row=grid.length;
        int col=grid[0].length;
        if(i<0 || i>=row || j<0 || j>=col){
            return false;
        }
        if(grid[i][j]==1 || grid[i][j]==2){
            return true;
        }
        grid[i][j]=2;
        boolean up=dfs(grid,i-1,j);
        boolean down=dfs(grid,i+1,j);
        boolean left=dfs(grid,i,j-1);
        boolean right=dfs(grid,i,j+1);
        return up && down && right && left;
    }
}