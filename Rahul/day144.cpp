class Solution {
public:
    int dfs(vector<int>& nums, int k,int i,unordered_map<int,int>& p){
        if(i == nums.size()){
            return 1;
        }
        int t = 0;
        if(!p[nums[i]-k] && !p[nums[i]+k]){
            p[nums[i]]++;
            t=dfs(nums,k,i+1,p);
            p[nums[i]]--;
        }
        int nt = dfs(nums,k,i+1,p);
        return t+nt;
    }
    int beautifulSubsets(vector<int>& nums, int k) {
       unordered_map<int,int>p;
       int ans = dfs(nums,k,0,p);
       return ans-1;

    }
};