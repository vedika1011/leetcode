class Solution {
    public String[] createGrid(int m, int n) {
        //go right then down or go down then right
        char[][] grid=new char[m][n];
        for(int i=0;i<m;i++){
            Arrays.fill(grid[i],'#');
        }
        Arrays.fill(grid[0],'.');
        for(int i=0;i<m;i++){
        grid[i][n-1]='.';
        }
        String[] res=new String[m];
        for(int i=0;i<m;i++){
            res[i]=new String(grid[i]);
        }
        return res;
    }
}