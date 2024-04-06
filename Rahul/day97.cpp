class Solution {
public:
    string minRemoveToMakeValid(string s) {
        stack<pair<char, int>> st;
        for(int i = 0; i < s.size(); i++) {
            char c = s[i];
            if(c == '(') {
                st.push({c, i});
            }else if(c == ')') {
                if(!st.empty() && st.top().first == '(') st.pop();
                else st.push({c, i});
            }
        }

        string answer = "";
        for(int i = s.size() - 1; i >= 0; i--) {
            if(!st.empty() && st.top().second == i) {
                s.erase(i, 1);
                st.pop();
            }
        }

        return s;
    }
};