class Solution {
    bool palindrome(string s){
        int n = s.size();
        int st = 0;
        int e= n-1;
        while(st<e){
          if(s[st++] != s[e--])
               return false;
        }
           return true;
        }
public:
    string firstPalindrome(vector<string>& words) {
        int n = words.size();
        for(int i=0;i<n;i++){
            if( palindrome(words[i]))
               return words[i];
        }
        return "";
    
    }
};