class Solution {
public:
    string getmapped(string &num,vector<int>& mapping ){
        string t="";
        for(int i=0;i<num.length();i++){
            char ch = num[i];
            int p = ch-'0';
            t += to_string(mapping[p]);
        }
        return t;
    }
    
    vector<int> sortJumbled(vector<int>& mapping, vector<int>& nums) {
        vector<pair<int,int>> a;
         int n = nums.size();
         for(int i=0;i<n;i++){
           string x = to_string(nums[i]);
           string mn = getmapped(x , mapping);
           int nb = stoi(mn);
           a.push_back({nb,i});
         }
         sort(begin(a),end(a));
         vector<int> result;
         for(auto &p : a){
            int i = p.second;
            result.push_back(nums[i]);
         }
         return result;
    }
};