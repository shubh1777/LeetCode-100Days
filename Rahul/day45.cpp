class Solution {
public:
    vector<int> rearrangeArray(vector<int>& nums) {
        int n= nums.size();
        vector<int> pos,neg;
        for(auto i : nums){
            if(i<0){
                neg.push_back(i);
            }else{
                pos.push_back(i);
            }
        }
        int k=0,i=0,j=0;
        while(i<neg.size() && j<pos.size()){
            nums[k++]=pos[j++];
            nums[k++]=neg[i++];
        }
        while(i<neg.size()){
            nums[k++]=neg[i++];
        }
        while(j<pos.size()){
            nums[k++]=pos[j++];
        }
        return nums;
    }
};