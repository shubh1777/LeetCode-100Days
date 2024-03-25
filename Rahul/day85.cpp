class Solution {
public:
    vector<int> findDuplicates(vector<int>& nums) {
       set<int> a;
       vector<int> ans;
       for(int i=0;i<nums.size();i++){
           if(a.count(nums[i])==1){
               ans.push_back(nums[i]);
           }else{
           a.insert(nums[i]);
           }
       }
       return ans;
    }
};