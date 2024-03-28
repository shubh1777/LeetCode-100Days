class Solution {
public:
    int maxSubarrayLength(vector<int>& nums, int k) {
        unordered_map<int,int> mp;
        int n = nums.size();
        int i=0,j=0;
        int count =0;
        while(j<n){
            mp[nums[j]]++;
            while(mp[nums[j]]>k && i<=j){
                mp[nums[i]]--;
                i++;
            }
            count = max(count,j-i+1);
            j++;
        }
        return count;
    }
};