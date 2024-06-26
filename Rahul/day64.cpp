class Solution {
public:
    int bagOfTokensScore(vector<int>& tokens, int power) {
        int n= tokens.size();
        sort(tokens.begin(),tokens.end());
        int s = 0;
        int e = n-1;
        int count=0;
        int gain=0;
        while(s<=e){
            if(power>=tokens[s]){
                power=power-tokens[s++];
                count++;
                gain = max(gain,count);
            }
            else if(count >0){
                power = tokens[e--]+power;
                count--;
            }
            else{
              break;
            }
        }
        return gain;
    }
};