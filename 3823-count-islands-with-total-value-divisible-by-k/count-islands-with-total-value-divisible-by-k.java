class Solution {
    public int countIslands(int[][] grid, int k) {
      int count=0;
      int rows=grid.length;
      int cols=grid[0].length;
      for(int i=0;i<rows;i++){
        for(int j=0;j<cols;j++){
            if(grid[i][j]>0){
                long sum=dfs(grid,i,j);
                 if(sum%k==0){
                count++;
            }
            }
           
        }
      }
      return count; 
      } 
      public long dfs(int[][] grid, int i, int j){
        int r=grid.length;
        int c=grid[0].length;
        if (i >= r || i < 0 || j >= c || j < 0 || grid[i][j] == 0) {
    return 0;
}
        int curr=grid[i][j];
        grid[i][j]=0; //visited
        long up=dfs(grid,i-1,j);
        long down=dfs(grid,i+1,j);
        long left=dfs(grid,i,j-1);
        long right=dfs(grid,i,j+1);
        long tot=curr+up+down+left+right;
        return tot;
      } 
    
}