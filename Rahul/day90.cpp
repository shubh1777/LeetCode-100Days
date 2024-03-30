class Solution {
public:
    int solve(vector<int>& nums, int k){
        map<int,int>mp;
        int i=0,j=0,count=0;
        int n = nums.size();
        while(j<n){
            mp[nums[j]]++;
            while(mp.size()>k && i<=j ){
             if(--mp[nums[i]]==0) mp.erase(nums[i]);
                i++;
            }
            count += (j-i+1);
            j++;
        }
        return count;
    }
    int subarraysWithKDistinct(vector<int>& nums, int k) {
       return solve(nums,k)-solve(nums,k-1);
    }
};