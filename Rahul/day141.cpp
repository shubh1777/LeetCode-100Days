class Solution {
public:
    int subsetXORSum(vector<int>& nums) {
        return dfs(nums,0,0);
    }
    int dfs(vector<int>& nums,int index,int curr){
        if(index == nums.size()){
            return curr;
        }
        int inc = dfs(nums,index+1,curr^nums[index]);
        int exc = dfs(nums,index+1,curr);
        return inc+exc;
    }
};