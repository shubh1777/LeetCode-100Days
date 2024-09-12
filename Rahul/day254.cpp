class Solution {
public:
    int countConsistentStrings(string allowed, vector<string>& words) {
        int count = 0;
        set<char> s(allowed.begin(),allowed.end());
        int flag;
        for(auto x:words){
            flag = 0;
            for(auto ch : x){
                if(s.find(ch) == s.end()){
                      flag =1;
                      break;
                }
            }
            if(flag == 0)
               count++;
        }
       return count;
    }
};