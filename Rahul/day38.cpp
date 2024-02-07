class Solution {
public:
    string frequencySort(string s) {
       vector<pair<int,char>> vs;
       map<char,int> p;
       for(int i=0;i<s.size();i++){
           p[s[i]]++;
       }
       for(auto i: p){
           vs.push_back({i.second,i.first});
       }
       sort(vs.rbegin(),vs.rend());
       string ans;
       for(auto i: vs){
           for(int j=0;j<i.first;j++){
               ans += i.second;
           }
       }
       return ans;
    }
};