class Solution {
public:
    bool isSameAfterReversals(int num) {
        int rev1=0,rev2=0;
        int temp=num;
        while(temp!=0){
           rev1 = rev1*10+(temp%10);
           temp = temp/10;
        }
        while(rev1!=0){
            rev2 = rev2*10+(rev1%10);
            rev1=rev1/10;
        }
        if(rev2 == num){
            return true;
        }
        return false;
    }
};