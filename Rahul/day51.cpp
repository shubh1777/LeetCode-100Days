class Solution {
public:
    int missingNumber(vector<int>& nums) {
        // int n = nums.size();
        // unordered_set<int> mp;
        // int count = 0;
        // for(auto i:nums){
        //     mp.insert(i);
        // }
        // for(int i=0;i<=n;i++){
        //     if(!mp.count(i)){
        //      return i;
        //     }
        // }
        // return -1;
        int n= nums.size();
        int sum=0;
        sum = (n*(n+1))/2;
        int ans=sum-accumulate(nums.begin(),nums.end(),0);
        return ans;
    }
};