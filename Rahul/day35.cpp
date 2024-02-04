class Solution {
public:
    int canCompleteCircuit(vector<int>& gas, vector<int>& cost) {
        int sum1 =0,sum2=0,index=0;
        for(int i=0;i<gas.size();i++){
            sum1 += gas[i]-cost[i];
            sum2 += gas[i]-cost[i];
            if(sum1<0){
             index = i+1;
             sum1 =0;
            }
        }
        return sum2>=0 ? index:-1;
    }
};