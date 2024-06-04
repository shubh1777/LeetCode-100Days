class Solution {
public:
    int longestPalindrome(string s) {
        int ans = 0;
        unordered_map<char,int> p;
        for(auto c : s){
            p[c]++;
        }
        bool isOdd = false;
        for(auto[c,fr]: p){
            if(fr%2==0){
                ans += fr;
            }else{
                ans += fr-1;
                isOdd = true;
            }
        }
        return ans+isOdd;
    }
};