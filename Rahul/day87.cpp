class Solution {
public:
    int numSubarrayProductLessThanK(vector<int>& nums, int k) {
        
        int count = 0;
        int prod =1;
        if(k==0 || k==1){
            return 0;
        }
        int n = nums.size();
        int i=0,j=0;
        while(j<n){
            prod = prod*nums[j];
            while(i<n && prod>=k){
                prod = prod/nums[i];
                i++;
            }
            count = count+j-i+1;
            j++;
        }
        return count;
    }
};