class Solution {
public:
    vector<int> largestDivisibleSubset(vector<int>& nums) {
        int n = nums.size();
        vector<int> dp(n,1),hash(n);
        int maxi = 1;
        int ID = 0;
        sort(nums.begin(),nums.end());
        for(int i=1;i<n;i++){
            hash[i]=i;
            for(int j = 0;j<i;j++){
                if(nums[i]%nums[j]==0 && 1+dp[j]>dp[i]){
                    dp[i] = 1+dp[j];
                    hash[i]=j;
                }
            }
            if(dp[i]>maxi){
                maxi=dp[i];
                ID = i;
            }
        }
          vector<int> temp;
          temp.push_back(nums[ID]);
          while(hash[ID] != ID){
              ID = hash[ID];
              temp.push_back(nums[ID]);
          } 
          reverse(temp.begin(),temp.end());
          return temp;
    }
};