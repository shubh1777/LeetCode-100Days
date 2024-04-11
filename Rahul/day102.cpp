class Solution {
public:
    string removeKdigits(string num, int k) {
        stack<char> s;
        for(int i=0;i<num.size();i++){
            while(s.size()>0 and k>0 and s.top()>num[i]){
                s.pop();
                k--;
            }
            s.push(num[i]);
        }
        while(s.size()>0 and k>0){
            k--;
            s.pop();
        }
        string ans = "";
        while(s.size()>0){
            char ch = s.top();
            s.pop();
            ans.push_back(ch);
        }
        reverse(ans.begin(),ans.end());
        int j=0;
        while(ans[j]=='0' && ans.size()>1){
            j++;
        }
        if(j!=0 && j<ans.size()){
            return ans.substr(j);
        }
        if(j==ans.size()){
            return "0";
        }
        if(ans==""){
            return "0";
        }
        return ans;
    }
};