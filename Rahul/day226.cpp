class Solution {
public:
    bool lemonadeChange(vector<int>& bills) {
        int five = 0, ten = 0;

        for(int bill : bills) {
            if(bill == 5) {
                five++;  // Increment the count of $5 bills
            } else if(bill == 10) {
                if(five > 0) {
                    five--;  // Use one $5 bill as change
                    ten++;   // Increment the count of $10 bills
                } else {
                    return false;  // No $5 bill to give change
                }
            } else if(bill == 20) {
                if(ten > 0 && five > 0) {
                    ten--;  // Use one $10 bill
                    five--; // Use one $5 bill
                } else if(five >= 3) {
                    five -= 3;  // Use three $5 bills
                } else {
                    return false;  // Not enough bills to give change
                }
            }
        }
        return true;
    }
};
