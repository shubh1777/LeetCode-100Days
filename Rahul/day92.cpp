class Solution {
public:
    int lengthOfLastWord(string s) {
        int n = s.length();
        int count =0;
        bool flag = false;
        for(int i=n-1;i>=0;i--){
            if(s[i] != ' '){
                flag = true;
                count++;
            }else if(s[i]== ' ' && flag== true){
                break;
            }
        }
        return count;
    }
};