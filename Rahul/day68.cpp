class Solution {
public:
    int maxFrequencyElements(vector<int>& nums) {
        int n = nums.size();
        unordered_map<int,int> mp;
        for(auto i: nums){
            mp[i]++;
        }
        int count=0;
        int maxi =0;
        for(auto i: mp){
          maxi = max(maxi,i.second);
        }
        for(auto i: mp){
         if(i.second == maxi)
              count++;
        }
        return count * maxi;
    }
};