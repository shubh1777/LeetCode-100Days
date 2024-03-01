class Solution {
public:
    string maximumOddBinaryNumber(string s) {
        int n = s.size();
        //string t =1;
        sort(s.rbegin(),s.rend());
        // for(int i=0;i<n-1;i++){
        //     if(s[i]=='0'){
        //         swap(s[i-1],s[n-1]);
        //     }
        // }
        for(int i=n-1;i>=0;i--){
            if(s[i]=='1'){
                swap(s[i],s[n-1]);
            }
        }
        return s;
    }
};