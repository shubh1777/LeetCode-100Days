class Solution {
public:
     static bool sortcol(const vector<int>& v1, const vector<int>& v2)
    {
        return v1[1] > v2[1];
    }
    int maximumUnits(vector<vector<int>>& boxTypes, int truckSize) {
        sort(boxTypes.begin(),boxTypes.end(),sortcol);
        int sum =0;
        for(auto i: boxTypes){
            int x = min(truckSize , i[0]);
            sum += x*i[1];
            truckSize -= x;
        }
        return sum;
    }
};