class Solution {
public:
    long long largestPerimeter(vector<int>& nums) {
        int n = nums.size();
        sort(nums.begin(),nums.end());
        long long int sum =nums[0]+nums[1],sum1 =0;
        for(int i=2;i<n;i++){
            if(sum>nums[i]){
                sum1 = sum+nums[i];
            }
            sum += nums[i];
        }
        if(sum1 == 0){
            return -1;
        }
        return sum1;
    }
};