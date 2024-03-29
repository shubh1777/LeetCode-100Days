class Solution {
public:
    long long countSubarrays(vector<int>& nums, int k) {
        int n = nums.size();
        long long count =0;
        unordered_map<int,int>mp;
        int a=0;
        for(auto x: nums){
          a = max(a,x);
        }
        int i=0,j=0;
        while(j<n){
            mp[nums[j]]++;
            while(mp[a]>=k){
                 mp[nums[i]]--;
                count =count+ n-j;
                i++;
            }
            j++;
        }
        return count;
    }
};