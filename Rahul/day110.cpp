class Solution {
public:
    
    void dfs(vector<vector<char>>& grid , int i, int j){
        if (i < 0 || i >= grid.size() || j < 0 || j >= grid[0].size() || grid[i][j] != '1') {
            return;
        }
        
        grid[i][j] = '0';

        dfs(grid,i+1,j);
        dfs(grid,i-1,j);
        dfs(grid,i,j+1);
        dfs(grid,i,j-1);
    }
    int numIslands(vector<vector<char>>& grid) {
        int m = grid.size();
        int n = grid[0].size();
        int island = 0;
        for(int i=0;i<m;i++){
            for(int j = 0;j<n;j++){
                if(grid[i][j]  == '1'){
                    dfs(grid,i,j);
                    island++;
                }
            }
        }
        return island;
    }
};