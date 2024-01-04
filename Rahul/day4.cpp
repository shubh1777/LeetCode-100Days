class Solution {
public:
    int maximizeSum(vector<int>& nums, int k) {
        sort(nums.begin(),nums.end());
        int n = nums.size();
        int sum=nums[n-1];
        int p = sum;
        while(k>1){
          sum += (p+1);
          p=p+1;
          k--;
        }
        return sum;
    }
};