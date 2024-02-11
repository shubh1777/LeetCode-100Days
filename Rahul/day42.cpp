class Solution {
    int solve(vector<int>& cost,int n,vector<int>&dp){
        if(n==0){
            return cost[0];
        }
        if(n==1){
            return cost[1];
        }
        if(dp[n]!= -1){
              return dp[n];
        }
        dp[n] = cost[n]+ min(solve(cost,n-1,dp),solve(cost,n-2,dp));
        return dp[n];
    }
public:
    int minCostClimbingStairs(vector<int>& cost) {
        int n= cost.size();
        vector<int> dp(n+1,-1);
        int ans = min(solve(cost,n-1,dp),solve(cost,n-2,dp));
        return ans;
    }
};

class Solution {
public:
    bool searchMatrix(vector<vector<int>>& matrix, int target) {
        int row=matrix.size();
        int col = matrix[0].size();
        int start =0;
        int end = row*col-1;
        int mid = start+(end-start)/2;
        while(start<=end){
            int element = matrix[mid/col][mid%col];
            if(element == target ){
                return 1;
            }
            if(element<target){
                start = mid+1;
            }else{
                end = mid-1;
            }
             mid = start+(end-start)/2;
        }
        return 0;
    }
};