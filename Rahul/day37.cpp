class Solution {
public:
    vector<int> pivotArray(vector<int>& nums, int pivot) {
        vector<int> p1;
        vector<int> p2;
        int count =0;
        for(int i=0;i<nums.size();i++){
            if(nums[i]==pivot){
                count++;
            }else if(nums[i]<pivot){
                p1.push_back(nums[i]);
            }else{
                p2.push_back(nums[i]);
            }
        }
        for(int i=0;i<count;i++){
            p1.push_back(pivot);
        }
        for(auto i: p2 ){
            p1.push_back(i);
        }
        return p1;
    }
};