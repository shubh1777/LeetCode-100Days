class Solution {
public:
    int countSeniors(vector<string>& details) {
        int n = details.size();
        int age =0;
        int t,p;
        for(int i=0;i<n;i++){
         int ans = stoi(details[i].substr(11,2));
         age += ans>60;
        }
      
        return age;
    }
};