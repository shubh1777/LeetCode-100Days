class Solution {
public:
    int balancedStringSplit(string s) {
        int c1=0,c2=0,sum=0;
        for(int i=0;i<s.size();i++){
            if(s[i]=='R')
               c1++;
            if(s[i]=='L')
                c2++;
            if(c1 == c2)
               sum++;
        }
        return sum;
    }
};