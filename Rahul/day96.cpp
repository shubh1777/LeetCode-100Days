class Solution {
public:
    string makeGood(string s) {
        string ans="";
        stack<char>st;
        st.push(s[0]);
        for(int i=1;i<s.size();i++){
           // st.push(s[i]);
            if(st.empty()!=true &&  st.top()+32==s[i]){
               st.pop();
            }else if(st.empty()!=true &&  st.top()==s[i]+32){
                st.pop();
            }else{
                st.push(s[i]);
            }
        }
        while(st.empty()!=true){
            ans.push_back(st.top());
            st.pop();
        }
        reverse(ans.begin(),ans.end());
        return ans;
    }
};