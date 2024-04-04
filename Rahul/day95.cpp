class Solution {
public:
    int maxDepth(string s) {
        int t =0;
        int r =0;
        for(auto c: s){
            if(c == '(') {
                t++;
            }
             if(c == ')'){
                t--;   
                
            }
            r = max(r,t);
        }
        return r;
    }
};