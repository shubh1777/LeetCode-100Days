class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
         int n = nums.size();
        vector<int> ans(n,0);
        int zero = 0;int product =1;
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                product *= nums[i];
            }else{
                zero++;
            }
        }
        if(zero >1){
         return ans;
        }else if(zero == 1){
            for(int i=0;i<n;i++){
                if(nums[i]==0){
                    ans[i]=product;
                    break;
                }
            }
        }else{
            for(int i=0;i<n;i++){
               ans[i]=product/nums[i];
            }
        }
        return ans;
    }
};