class Solution {
    int n=0;
    int m=0;
    public int numIslands(char[][] grid) {
         n=grid.length;
         m=grid[0].length;
         int count=0;
         for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]=='1'){
                    dfs(grid,i,j);
                    count++;
                } 
            }
         }
         return count;
    }
    public void dfs(char[][] grid,int i,int j){
        if(i<0 || i>=n || j<0 || j>=m){
            return;
        }
        if(grid[i][j]=='0' || grid[i][j]=='2'){
            return;
        }
        grid[i][j]='2';
        dfs(grid,i-1,j);
        dfs(grid,i,j+1);
        dfs(grid,i+1,j);
        dfs(grid,i,j-1);
    }
}
