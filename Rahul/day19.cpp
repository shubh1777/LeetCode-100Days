class Solution {
public:
    int heightChecker(vector<int>& heights) {
        int count = 0;
        vector<int> temp(heights.begin(),heights.end());
        sort(temp.begin(),temp.end());
        for(int i=0;i<heights.size();i++){
          if(heights[i] != temp[i]){
              count++;
          }
        }
        return count;
    }
};