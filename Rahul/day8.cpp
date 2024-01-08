class Solution {
public:
    int candy(vector<int>& ratings) {
        int n = ratings.size(),sum=0;
        vector<int> arr;
        arr.push_back(1);
        for(int i=1;i<n;i++){
            if(ratings[i]> ratings[i-1] ){
                arr.push_back(arr[i-1]+1);
            }else{
                arr.push_back(1);
            }
        }
        for(int i=n-2;i>=0;i--){
            if(ratings[i]>ratings[i+1]){
                arr[i]=max(arr[i],arr[i+1]+1);
            }
        }
        for(auto x : arr){
            sum += x;
        }
        return sum;
    }
};
