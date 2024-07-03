class Solution {
public:
    int minDifference(vector<int>& nums) {
        sort(nums.begin(),nums.end());
        int n = nums.size();
        if(n<=4){
            return 0;
        }
        int minval = INT_MAX;
        minval = min(minval,nums[n-4]-nums[0]);
        minval = min(minval,nums[n-3]-nums[1]);
        minval = min(minval,nums[n-2]-nums[2]);
        minval = min(minval,nums[n-1]-nums[3]);
        return minval;
    }
};