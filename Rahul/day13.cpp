class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int sum =0 , profit = prices[0];
        for(int i=1;i<prices.size();i++){
          sum = max(sum,prices[i]-profit);
          profit = min(prices[i],profit);
        }
        return sum;
    }
};