class Solution {
public:
    int minimumLength(string s) {
        int n = s.length();
        int start=0;
        int end=n-1;
        int count=0;
        if(n<=2 && s[start] != s[end]){
            return n;
        }
        while(start<end){
            if(s[start] == s[end]){
              while(s[start] == s[start+1] && start<end) start++;
              while(s[end] == s[end-1] && start<end) end--;
              start++;
              end--;
            }else{
                break;
            }
        }
        count = end-start+1;
        if(count<0){
            return 0;
        }
        return count;
    }
};