class Solution {
public:
    int maximum69Number (int num) {
        string s;
        while(num){
            int rem = num%10;
            num=num/10;
            s += (rem+'0');
        }
         reverse(s.begin(),s.end());
        for(int i=0;i<s.size();i++){
            if(s[i]=='6'){
                s[i]='9';
                break;
            }
        }
        int ans = stoi(s);
        return ans;
    }
};