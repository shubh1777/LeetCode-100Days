class Solution {
public:
    bool isPowerOfTwo(int n) {
        if(n==0){
            return 0;
        }
            while(n>0){
             if(n == 1){
                 return 1;
             }
            if(n%2 != 0){
                break;
            }
              n = n/2;
            }
          
        return 0;
    }
};