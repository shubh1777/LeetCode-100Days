class Solution {
public:
    int maxCoins(vector<int>& piles) {
        int n = piles.size();
        sort(piles.begin(),piles.end());
        int start =0,end = n-1;
        int sum = 0;
        while(start++<n/3){
            sum += piles[end-1];
            end = end-2;
        }
        return sum;
    }
};