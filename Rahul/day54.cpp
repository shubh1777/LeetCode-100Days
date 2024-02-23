class Solution {
public:
    int garbageCollection(vector<string>& garbage, vector<int>& travel) {
        int ans = 0;
        int lm=0,lp=0,lg=0;
        int countm=0,countp=0,countg=0;
        vector<int> p(travel.size()+1);
        p.push_back(0);
        for(int i=1;i<=travel.size();i++){
             p[i] = p[i-1]+travel[i-1];
        }
        for(int i=0;i<garbage.size();i++){
            string s = garbage[i];
            for(auto c:s){
                if(c == 'M') countm++,lm=i;
                if(c == 'P') countp++,lp=i;
                if(c == 'G') countg++,lg=i;
            }
        }
        if(countm) ans+= (countm+p[lm]);
        if(countp) ans+= (countp+p[lp]);
        if(countg) ans+= (countg+p[lg]);

        return ans;
    }
};