class Solution {
public:
    bool isPalindromic(string &s){
        int i=0; 
        int j=s.size()-1;
        while(i<j){
            if(s[i]!=s[j]){
                return false;
                i++ ,j--;
            }
        }
        return true;
    } 
    bool isStrictlyPalindromic(int n) {
        for(int i=2;i<=n-2;i++){
            string rep=" ";
            int m = n;
            while(m){
            rep += (to_string(m%i));
            m = m/i;
        }
        if(!isPalindromic(rep)){
            return false;
        }
        }
        return true;
    }
};