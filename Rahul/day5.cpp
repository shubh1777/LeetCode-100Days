class Solution {
public:
    string makeSmallestPalindrome(string s) {
        int i=0, r=s.size()-1;
        while(i<r){
            if(s[i]<=s[r]){
                s[r]=s[i];
            }else{
                s[i]=s[r];
            }
            i++;
            r--;
        }
        return s;
    }
};