class Solution {
public:
    int getCommon(vector<int>& nums1, vector<int>& nums2) {
        int n = nums1.size();
        int m = nums2.size();
        int i=0,j=0;
        int count =0;
        int maxi=INT_MAX;
        while(i<n && j<m){
            if(nums1[i] == nums2[j]){
                count = nums1[i];
                break;
            }else if(nums1[i]<nums2[j]){
                i++;
            }else{
                j++;
            }
        }
        if(count){
            return count;
        }
        return -1;
    }
};