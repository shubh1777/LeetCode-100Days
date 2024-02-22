class Solution {
public:
    int findJudge(int n, vector<vector<int>>& trust) {
      vector<int> in(n+1);
      vector<int> out(n+1);
      if(trust.size()<n-1){
          return -1;
      }
      for(int i=0;i<trust.size();i++){
          out[trust[i][0]]++;
          in[trust[i][1]]++;
      }
      for(int i=1;i<=n;i++){
          if(in[i]==n-1 && out[i]==0){
              return i; 
          }
      }
      return -1;
    }
};