class Solution {
public:
    int maxDistance(vector<vector<int>>& arrays) {
        int n = arrays.size();
        if (n == 1) return 0; // Handle the case with only one array.
        
        int minm = 1e5;
        int maxm = -1e5;
        int diff = 0;
        
        for(auto& arr : arrays){
            int mi = arr[0];
            int ma = arr.back();
            diff = max(diff, max(ma - minm, maxm - mi));
            minm = min(minm, mi);
            maxm = max(maxm, ma);
        }
        
        return diff;
    }
};
