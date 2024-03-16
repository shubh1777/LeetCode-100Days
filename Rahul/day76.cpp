class Solution {
public:
    int findMaxLength(vector<int>& nums) {
        int n = nums.size();
        int count=0;
        unordered_map<int,int> mp;
        int currsum = 0;
        mp[0] = -1;
        for(int i=0;i<n;i++){
            currsum += (nums[i] == 1) ?1:-1;
            if(mp.find(currsum)!= mp.end()){
                count=max(count,i-mp[currsum]);
            }else{
                mp[currsum] = i;
            }
        }
        return count;
    }
};