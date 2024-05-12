class Solution {
    public int[][] largestLocal(int[][] grid) {
        int len=grid.length-2;
        int[][] res=new int[len][len];
        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++){
                int max=grid[i][j];
                for(int k=i;k<=i+2;k++){
                    for(int l=j;l<=j+2;l++){
                        if(grid[k][l]>max){
                            max=grid[k][l];
                        }
                    }
                }
                res[i][j]=max;
            }
        }
        return res;
    }
}
