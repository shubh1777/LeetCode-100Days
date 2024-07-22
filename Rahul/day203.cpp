class Solution {
public:
    vector<string> sortPeople(vector<string>& names, vector<int>& heights) {
     vector<pair<int ,string>> A;
     int n = names.size();
     for(int i=0;i<n;i++){
         A.push_back({heights[i],names[i]});
     }
     sort(A.rbegin(),A.rend());
     vector<string> ans;
     for(int i=0;i<n;i++){
         ans.push_back(A[i].second);
     }
     return ans;
    }
};